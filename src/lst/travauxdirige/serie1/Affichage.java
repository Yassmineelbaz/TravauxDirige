package lst.travauxdirige.serie1;
import java.util.Scanner;
public class Affichage {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez le nombre de lignes pour le triangle : ");
            int nombreLignes = scanner.nextInt();

            afficherTriangleNumerique(nombreLignes);

            scanner.close();
        }

        private static void afficherTriangleNumerique(int nombreLignes) {
            for (int i = 1; i <= nombreLignes; i++) {
                // Afficher les chiffres de 1 à i sur chaque ligne
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();

        }
    }
}
