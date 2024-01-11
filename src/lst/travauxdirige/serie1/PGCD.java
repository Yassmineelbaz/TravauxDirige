package lst.travauxdirige.serie1;

import java.util.Scanner;

public class PGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir deux entiers positifs non nuls
        System.out.print("Entrez le premier entier positif non nul (a) : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième entier positif non nul (b) : ");
        int b = scanner.nextInt();

        // Calculer et afficher le PGCD
        int pgcd = calculerPGCD(a, b);
        System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd);

        scanner.close();
    }

    // Méthode pour calculer le PGCD en utilisant l'algorithme d'Euclide
    private static int calculerPGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}