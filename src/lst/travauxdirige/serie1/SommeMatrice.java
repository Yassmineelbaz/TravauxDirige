package lst.travauxdirige.serie1;
import java.util.Scanner;
public class SommeMatrice {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez la taille des matrices carrées (par exemple, 2 pour une matrice 2x2) : ");
            int taille = scanner.nextInt();

            double[][] matrice1 = saisirMatrice("Matrice 1", taille);

            double[][] matrice2 = saisirMatrice("Matrice 2", taille);

            double[][] somme = additionnerMatrices(matrice1, matrice2);

            afficherMatrice("Matrice 1", matrice1);
            afficherMatrice("Matrice 2", matrice2);
            afficherMatrice("Somme", somme);

            scanner.close();
        }

        private static double[][] saisirMatrice(String nomMatrice, int taille) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Saisie de la " + nomMatrice + " :");

            double[][] matrice = new double[taille][taille];

            for (int i = 0; i < taille; i++) {
                for (int j = 0; j < taille; j++) {
                    System.out.print("Entrez l'élément à la position [" + (i + 1) + "][" + (j + 1) + "] : ");
                    matrice[i][j] = scanner.nextDouble();
                }
            }

            return matrice;
        }

        private static double[][] additionnerMatrices(double[][] matrice1, double[][] matrice2) {
            int taille = matrice1.length;
            double[][] somme = new double[taille][taille];

            for (int i = 0; i < taille; i++) {
                for (int j = 0; j < taille; j++) {
                    somme[i][j] = matrice1[i][j] + matrice2[i][j];
                }
            }

            return somme;
        }

        private static void afficherMatrice(String nomMatrice, double[][] matrice) {
            System.out.println("Affichage de la " + nomMatrice + " :");
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice[i].length; j++) {
                    System.out.print(matrice[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
