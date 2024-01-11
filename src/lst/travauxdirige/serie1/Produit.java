package lst.travauxdirige.serie1;
import java.util.Scanner;
public class Produit {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées au clavier
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer deux valeurs entières
        System.out.print("Entrez la valeur de A : ");
        int A = scanner.nextInt();

        System.out.print("Entrez la valeur de B : ");
        int B = scanner.nextInt();

        // Fermer le scanner pour éviter les fuites de ressources
        scanner.close();

        // Déterminer le signe du produit sans faire la multiplication
        int produit = A * B;
        String signeProduit;

        if (produit > 0) {
            signeProduit = "positif";
        } else if (produit < 0) {
            signeProduit = "négatif";
        } else {
            signeProduit = "nul";
        }

        // Afficher le signe du produit
        System.out.println("Le signe du produit de A et B est " + signeProduit + ".");
    }
}
