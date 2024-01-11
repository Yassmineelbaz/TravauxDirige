package lst.travauxdirige.serie1;
import java.util.Scanner;
public class Produit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de A : ");
        int A = scanner.nextInt();

        System.out.print("Entrez la valeur de B : ");
        int B = scanner.nextInt();

        

        int produit = A * B;
        String signeProduit;

        if (produit > 0) {
            signeProduit = "positif";
        } else if (produit < 0) {
            signeProduit = "négatif";
        } else {
            signeProduit = "nul";
        }

        System.out.println("Le signe du produit de A et B est " + signeProduit + ".");
    }
}
