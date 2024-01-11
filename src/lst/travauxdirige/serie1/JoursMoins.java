package lst.travauxdirige.serie1;
import java.util.Scanner;
public class JoursMoins {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez le numéro du mois (1 à 12) : ");
            int numeroMois = scanner.nextInt();

            if (numeroMois < 1 || numeroMois > 12) {
                System.out.println("Veuillez entrer un numéro de mois valide (entre 1 et 12).");
            } else {
                if (numeroMois == 2) {
                    // Demander à l'utilisateur d'entrer l'année
                    System.out.print("Entrez l'année (1900 à 2100) : ");
                    int annee = scanner.nextInt();

                    if (annee < 1900 || annee > 2100) {
                        System.out.println("Veuillez entrer une année valide (entre 1900 et 2100).");
                    } else {
                        int nombreJours = estBissextile(annee) ? 29 : 28;
                        System.out.println("Le mois de février a " + nombreJours + " jours.");
                    }
                } else {
                    int nombreJours = nombreJoursMois(numeroMois);
                    System.out.println("Le mois " + numeroMois + " a " + nombreJours + " jours.");
                }
            }

            scanner.close();
        }

        private static boolean estBissextile(int annee) {
            return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
        }

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
