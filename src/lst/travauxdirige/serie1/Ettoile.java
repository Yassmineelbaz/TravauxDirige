package lst.travauxdirige.serie1;
import java.util.Scanner;
public class Ettoile {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Demander à l'utilisateur de saisir la taille du motif
            System.out.print("Entrez la taille du motif : ");
            int taille = scanner.nextInt();

            // Afficher le motif d'étoiles
            afficherMotifEtoiles(taille);

            scanner.close();
        }

        private static void afficherMotifEtoiles(int taille) {
            // Afficher la partie supérieure du motif
            for (int i = 1; i <= taille; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Afficher la partie inférieure du motif
            for (int i = taille - 1; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
