package lst.travauxdirige.serie1;
import java.util.Scanner;
public class JoursMoins {
        public static void main(String[] args) {
            // Créer un objet Scanner pour lire les entrées au clavier
            Scanner scanner = new Scanner(System.in);

            // Demander à l'utilisateur d'entrer le numéro du mois
            System.out.print("Entrez le numéro du mois (1 à 12) : ");
            int numeroMois = scanner.nextInt();

            // Vérifier si le numéro du mois est valide
            if (numeroMois < 1 || numeroMois > 12) {
                System.out.println("Veuillez entrer un numéro de mois valide (entre 1 et 12).");
            } else {
                // Vérifier si le mois est février
                if (numeroMois == 2) {
                    // Demander à l'utilisateur d'entrer l'année
                    System.out.print("Entrez l'année (1900 à 2100) : ");
                    int annee = scanner.nextInt();

                    // Vérifier si l'année est dans la plage spécifiée
                    if (annee < 1900 || annee > 2100) {
                        System.out.println("Veuillez entrer une année valide (entre 1900 et 2100).");
                    } else {
                        // Vérifier si l'année est bissextile
                        int nombreJours = estBissextile(annee) ? 29 : 28;
                        System.out.println("Le mois de février a " + nombreJours + " jours.");
                    }
                } else {
                    // Nombre de jours pour les autres mois (sauf février)
                    int nombreJours = nombreJoursMois(numeroMois);
                    System.out.println("Le mois " + numeroMois + " a " + nombreJours + " jours.");
                }
            }

            // Fermer le scanner pour éviter les fuites de ressources
            scanner.close();
        }

        // Méthode pour déterminer si une année est bissextile
        private static boolean estBissextile(int annee) {
            return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
        }

        // Méthode pour obtenir le nombre de jours d'un mois (sauf février)
        private static int nombreJoursMois(int numeroMois) {
            switch (numeroMois) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 4: case 6: case 9: case 11:
                    return 30;
                default:
                    return -1; // Ce cas ne devrait pas se produire
            }
        }

}
