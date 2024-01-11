package lst.travauxdirige.serie1;
import java.util.Scanner;
public class Max3 {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées au clavier
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer trois variables
        System.out.print("Entrez la première variable : ");
        int variable1 = scanner.nextInt();

        System.out.print("Entrez la deuxième variable : ");
        int variable2 = scanner.nextInt();

        System.out.print("Entrez la troisième variable : ");
        int variable3 = scanner.nextInt();

        // Fermer le scanner pour éviter les fuites de ressources
        scanner.close();

        // Trouver le maximum parmi les trois variables
        int maximum = trouverMaximum(variable1, variable2, variable3);

        // Afficher le résultat
        System.out.println("Le maximum des trois variables est : " + maximum);
    }

    // Méthode pour trouver le maximum parmi trois variables
    private static int trouverMaximum(int a, int b, int c) {
        // Utiliser l'opérateur ternaire pour simplifier la logique
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }
}
