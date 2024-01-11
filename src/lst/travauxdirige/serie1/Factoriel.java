package lst.travauxdirige.serie1;
import java.util.Scanner;

public class Factoriel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier naturel N : ");
        int N = scanner.nextInt();

        scanner.close();

        if (N < 0) {
            System.out.println("Veuillez entrer un entier naturel positif.");
        } else {
            long factoriel = calculerFactoriel(N);

            System.out.println("Le factoriel de " + N + " est : " + factoriel);
        }
    }

    private static long calculerFactoriel(int N) {
        if (N == 0 || N == 1) {
            return 1;
        } else {
            return N * calculerFactoriel(N - 1);
        }
    }
}
