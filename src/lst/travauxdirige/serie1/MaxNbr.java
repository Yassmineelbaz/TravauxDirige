package lst.travauxdirige.serie1;
import java.util.Scanner;
public class MaxNbr {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Question 1
            // Demander à l'utilisateur de saisir 20 nombres et afficher le maximum
            int max1 = trouverMaximum(scanner, 20);
            System.out.println("Le maximum des 20 nombres est : " + max1);

            // Question 2
            // Modifier le programme pour afficher la position du maximum
            PositionMaximum positionMax = trouverPositionMaximum(scanner, 20);
            System.out.println("Le maximum des 20 nombres est : " + positionMax.maximum);
            System.out.println("Il a été saisi en position : " + positionMax.position);

            // Question 3
            // Modifier le programme pour afficher le maximum d'une suite se terminant par 0
            int max3 = trouverMaximumSuite(scanner);
            System.out.println("Le maximum de la suite se terminant par 0 est : " + max3);

            scanner.close();
        }

        // Méthode pour trouver le maximum parmi une série de nombres
        private static int trouverMaximum(Scanner scanner, int nombreNombres) {
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < nombreNombres; i++) {
                System.out.print("Entrez le nombre #" + (i + 1) + " : ");
                int nombre = scanner.nextInt();

                if (nombre > max) {
                    max = nombre;
                }
            }

            return max;
        }

        // Structure pour stocker le maximum et sa position
        private static class PositionMaximum {
            int maximum;
            int position;
        }

        // Méthode pour trouver le maximum et sa position parmi une série de nombres
        private static PositionMaximum trouverPositionMaximum(Scanner scanner, int nombreNombres) {
            PositionMaximum positionMax = new PositionMaximum();
            positionMax.maximum = Integer.MIN_VALUE;

            for (int i = 0; i < nombreNombres; i++) {
                System.out.print("Entrez le nombre #" + (i + 1) + " : ");
                int nombre = scanner.nextInt();

                if (nombre > positionMax.maximum) {
                    positionMax.maximum = nombre;
                    positionMax.position = i + 1; // Position commence à 1
                }
            }

            return positionMax;
        }

        // Méthode pour trouver le maximum d'une suite se terminant par 0
        private static int trouverMaximumSuite(Scanner scanner) {
            int max = Integer.MIN_VALUE;
            int nombre;

            do {
                System.out.print("Entrez un nombre (saisissez 0 pour terminer) : ");
                nombre = scanner.nextInt();

                if (nombre > max) {
                    max = nombre;
                }

            } while (nombre != 0);

            return max;
        }

}
