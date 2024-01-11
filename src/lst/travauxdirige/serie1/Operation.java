package lst.travauxdirige.serie1;
import java.util.Scanner;
public class Operation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre entier (a) : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième nombre entier (b) : ");
        int b = scanner.nextInt();

        scanner.close();

        System.out.println("Choisissez une option :");
        System.out.println("1. Vérifier si la somme a + b est paire");
        System.out.println("2. Vérifier si le produit ab est pair");
        System.out.println("3. Connaître le signe de la somme a + b");
        System.out.println("4. Connaître le signe du produit ab");

        Scanner choixScanner = new Scanner(System.in);
        int choix = choixScanner.nextInt();

        switch (choix) {
            case 1:
                verifierSommePaire(a, b);
                break;
            case 2:
                verifierProduitPaire(a, b);
                break;
            case 3:
                connaitreSigneSomme(a, b);
                break;
            case 4:
                connaitreSigneProduit(a, b);
                break;
            default:
                System.out.println("Choix invalide. Veuillez choisir une option de 1 à 4.");
        }

        choixScanner.close();
    }

    private static void verifierSommePaire(int a, int b) {
        int somme = a + b;
        if (somme % 2 == 0) {
            System.out.println("La somme a + b est paire.");
        } else {
            System.out.println("La somme a + b n'est pas paire.");
        }
    }

    // Méthode pour vérifier si le produit ab est paire
    private static void verifierProduitPaire(int a, int b) {
        int produit = a * b;
        if (produit % 2 == 0) {
            System.out.println("Le produit ab est paire.");
        } else {
            System.out.println("Le produit ab n'est pas paire.");
        }
    }

    private static void connaitreSigneSomme(int a, int b) {
        int somme = a + b;
        if (somme > 0) {
            System.out.println("La somme a + b est positive.");
        } else if (somme < 0) {
            System.out.println("La somme a + b est négative.");
        } else {
            System.out.println("La somme a + b est égale à zéro.");
        }
    }

    private static void connaitreSigneProduit(int a, int b) {
        int produit = a * b;
        if (produit > 0) {
            System.out.println("Le produit ab est positif.");
        } else if (produit < 0) {
            System.out.println("Le produit ab est négatif.");
        } else {
            System.out.println("Le produit ab est égal à zéro.");
        }
    }
}
