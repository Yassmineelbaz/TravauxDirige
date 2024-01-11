package lst.travauxdirige.serie1;
import java.util.Scanner;

public class OrdreCroissant {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées au clavier
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer deux variables
        System.out.print("Entrez la première variable : ");
        int a = scanner.nextInt();

        System.out.print("Entrez la deuxième variable : ");
        int b = scanner.nextInt();

        // Fermer le scanner pour éviter les fuites de ressources
        scanner.close();

        // Vérifier et afficher les variables dans l'ordre croissant
        if (a > b) {
            // Échanger les valeurs si nécessaire
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Les variables dans l'ordre croissant sont : " + a + ", " + b);
    }
}
