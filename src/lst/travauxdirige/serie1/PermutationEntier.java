package lst.travauxdirige.serie1;

import java.util.Scanner;

public class PermutationEntier {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées au clavier
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer un entier de trois chiffres non nuls
        System.out.print("Entrez un entier de trois chiffres non nuls : ");
        int N = scanner.nextInt();

        // Fermer le scanner pour éviter les fuites de ressources
        scanner.close();

        // Vérifier si l'entier a trois chiffres non nuls
        if (N < 100 || N > 999 || N % 111 == 0) {
            System.out.println("Veuillez entrer un entier de trois chiffres non nuls.");
        } else {
            // Déterminer et afficher toutes les permutations des chiffres de N
            System.out.println("Les permutations possibles sont :");
            afficherPermutations(N);
        }
    }

    // Méthode pour afficher toutes les permutations des chiffres de l'entier
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
