package lst.travauxdirige.serie1;
import java.util.Arrays;
public class DecalageTableau {

        public static void main(String[] args) {
            char[] tableau = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};

            System.out.println("Tableau initial : " + Arrays.toString(tableau));

            decalerGauche(tableau);

            System.out.println("Tableau modifié : " + Arrays.toString(tableau));
        }

        private static void decalerGauche(char[] tableau) {
            char premierElement = tableau[0];

            for (int i = 0; i < tableau.length - 1; i++) {
                tableau[i] = tableau[i + 1];
            }

            tableau[tableau.length - 1] = premierElement;
        }
    }
