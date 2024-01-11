package lst.travauxdirige.serie1;
import java.util.Arrays;
public class DecalageTableau {

        public static void main(String[] args) {
            // Tableau initial
            char[] tableau = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};

            // Afficher le tableau initial
            System.out.println("Tableau initial : " + Arrays.toString(tableau));

            // Effectuer le décalage des éléments vers la gauche
            decalerGauche(tableau);

            // Afficher le tableau modifié
            System.out.println("Tableau modifié : " + Arrays.toString(tableau));
        }

        private static void decalerGauche(char[] tableau) {
            // Stocker le premier élément pour le réinsérer à la fin
            char premierElement = tableau[0];

            // Effectuer le décalage vers la gauche
            for (int i = 0; i < tableau.length - 1; i++) {
                tableau[i] = tableau[i + 1];
            }

            // Réinsérer le premier élément à la fin
            tableau[tableau.length - 1] = premierElement;
        }
    }
