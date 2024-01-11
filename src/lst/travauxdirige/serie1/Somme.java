package lst.travauxdirige.serie1;

import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier N : ");
        int N = scanner.nextInt();

        scanner.close();

        if (N <= 0) {
            System.out.println("Veuillez entrer un entier positif.");
        } else {
            int sommeImpairs = calculerSommeEntiersImpairs(N);
            System.out.println("La somme des entiers impairs inférieurs à " + N + " est : " + sommeImpairs);
        }
    }

    private static int calculerSommeEntiersImpairs(int N) {
        int somme = 0;

        for (int i = 1; i < N; i += 2) {
            somme += i;
        }

        return somme;
    }
}
