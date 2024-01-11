package lst.travauxdirige.serie1;
import java.util.Scanner;
public class ValeurMaxMin {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
            int taille = scanner.nextInt();

            if (taille < 10 || taille > 50) {
                System.out.println("La taille du tableau doit être entre 10 et 50.");
                return;
            }

            int[] tableau = new int[taille];
            for (int i = 0; i < taille; i++) {
                System.out.print("Entrez l'élément à l'indice " + i + " : ");
                tableau[i] = scanner.nextInt();
            }

            int valeurMax = trouverValeurMaximale(tableau);
            int valeurMin = trouverValeurMinimale(tableau);

            System.out.println("La valeur maximale du tableau est : " + valeurMax);
            System.out.println("La valeur minimale du tableau est : " + valeurMin);

            scanner.close();
        }

        private static int trouverValeurMaximale(int[] tableau) {
            int max = tableau[0];
            for (int i = 1; i < tableau.length; i++) {
                if (tableau[i] > max) {
                    max = tableau[i];
                }
            }
            return max;
        }

        private static int trouverValeurMinimale(int[] tableau) {
            int min = tableau[0];
            for (int i = 1; i < tableau.length; i++) {
                if (tableau[i] < min) {
                    min = tableau[i];
                }
            }
            return min;
        }
    }
