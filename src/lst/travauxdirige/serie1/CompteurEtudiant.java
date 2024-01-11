package lst.travauxdirige.serie1;
import java.util.Scanner;

public class CompteurEtudiant {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez le nombre d'étudiants : ");
            int nombreEtudiants = scanner.nextInt();

            double[] moyennes = new double[nombreEtudiants];

            for (int i = 0; i < nombreEtudiants; i++) {
                System.out.print("Entrez la moyenne de l'étudiant " + (i + 1) + " : ");
                moyennes[i] = scanner.nextDouble();
            }

            System.out.print("Entrez le seuil de moyenne : ");
            double seuil = scanner.nextDouble();

            int nombreEtudiantsSupSeuil = compterEtudiantsSupSeuil(moyennes, seuil);

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
