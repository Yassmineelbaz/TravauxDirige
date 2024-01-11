package lst.travauxdirige.serie1;
import java.util.Scanner;
public class Sommechiffre {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Demander à l'utilisateur de saisir un nombre entier
            System.out.print("Entrez un nombre entier : ");
            int nombre = scanner.nextInt();

            // Calculer et afficher la somme des chiffres du nombre
            int sommeChiffres = calculerSommeChiffres(nombre);
            System.out.println("La somme des chiffres de " + nombre + " est : " + sommeChiffres);

            scanner.close();
        }

        private static int calculerSommeChiffres(int nombre) {
            int somme = 0;

            // Utiliser une boucle pour additionner les chiffres du nombre
            while (nombre != 0) {
                somme += nombre % 10;  // Ajouter le dernier chiffre
                nombre /= 10;  // Supprimer le dernier chiffre
            }

            return somme;
        }
    }
