package lst.travauxdirige.serie1;
import java.util.Scanner;

public class CompteurEtudiant {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Demander à l'utilisateur de saisir le nombre d'étudiants
            System.out.print("Entrez le nombre d'étudiants : ");
            int nombreEtudiants = scanner.nextInt();

            // Créer le tableau des moyennes
            double[] moyennes = new double[nombreEtudiants];

            // Saisir les moyennes des étudiants
            for (int i = 0; i < nombreEtudiants; i++) {
                System.out.print("Entrez la moyenne de l'étudiant " + (i + 1) + " : ");
                moyennes[i] = scanner.nextDouble();
            }

            // Demander à l'utilisateur de saisir le seuil
            System.out.print("Entrez le seuil de moyenne : ");
            double seuil = scanner.nextDouble();

            // Compter le nombre d'étudiants ayant une moyenne supérieure ou égale au seuil
            int nombreEtudiantsSupSeuil = compterEtudiantsSupSeuil(moyennes, seuil);

            // Afficher le résultat
            System.out.println("Nombre d'étudiants ayant une moyenne supérieure ou égale au seuil : " + nombreEtudiantsSupSeuil);

            scanner.close();
        }

        private static int compterEtudiantsSupSeuil(double[] moyennes, double seuil) {
            int compte = 0;
            for (double moyenne : moyennes) {
                if (moyenne >= seuil) {
                    compte++;
                }
            }
            return compte;
        }

}
