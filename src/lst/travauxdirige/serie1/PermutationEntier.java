package lst.travauxdirige.serie1;

import java.util.Scanner;

public class PermutationEntier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier de trois chiffres non nuls : ");
        int N = scanner.nextInt();

        scanner.close();

        if (N < 100 || N > 999 || N % 111 == 0) {
            System.out.println("Veuillez entrer un entier de trois chiffres non nuls.");
        } else {
            System.out.println("Les permutations possibles sont :");
            afficherPermutations(N);
        }
    }

    private static void afficherPermutations(int N) {
        int centaine = N / 100;
        int dizaine = (N % 100) / 10;
        int unite = N % 10;

        System.out.println(centaine * 100 + dizaine * 10 + unite);
        System.out.println(centaine * 100 + unite * 10 + dizaine);
        System.out.println(dizaine * 10 + centaine * 100 + unite);
        System.out.println(dizaine * 10 + unite * 100 + centaine);
        System.out.println(unite * 100 + centaine * 10 + dizaine);
        System.out.println(unite * 100 + dizaine * 10 + centaine);
    }
}
