package lst.travauxdirige.serie1;

import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées au clavier
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer un entier N
        System.out.print("Entrez un entier N : ");
        int N = scanner.nextInt();

        // Fermer le scanner pour éviter les fuites de ressources
        scanner.close();

        // Vérifier si N est un entier positif
        if (N <= 0) {
            System.out.println("Veuillez entrer un entier positif.");
        } else {
            // Calculer et afficher la somme des entiers impairs inférieurs à N
            int sommeImpairs = calculerSommeEntiersImpairs(N);
            System.out.println("La somme des entiers impairs inférieurs à " + N + " est : " + sommeImpairs);
        }
    }

    // Méthode pour calculer la somme des entiers impairs inférieurs à N
    private static int calculerSommeEntiersImpairs(int N) {
        int somme = 0;

        for (int i = 1; i < N; i += 2) {
            somme += i;
        }

        return somme;
    }
}
