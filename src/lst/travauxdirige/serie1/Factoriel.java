package lst.travauxdirige.serie1;
import java.util.Scanner;

public class Factoriel {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées au clavier
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer un entier naturel N
        System.out.print("Entrez un entier naturel N : ");
        int N = scanner.nextInt();

        // Fermer le scanner pour éviter les fuites de ressources
        scanner.close();

        // Vérifier si N est un entier naturel positif
        if (N < 0) {
            System.out.println("Veuillez entrer un entier naturel positif.");
        } else {
            // Calculer le factoriel de N
            long factoriel = calculerFactoriel(N);

            // Afficher le résultat
            System.out.println("Le factoriel de " + N + " est : " + factoriel);
        }
    }

    // Méthode pour calculer le factoriel d'un entier
    private static long calculerFactoriel(int N) {
        if (N == 0 || N == 1) {
            return 1;
        } else {
            return N * calculerFactoriel(N - 1);
        }
    }
}
