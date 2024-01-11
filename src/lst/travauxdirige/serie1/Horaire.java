package lst.travauxdirige.serie1;
import java.util.Scanner;
public class Horaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'heure (format 24 heures) : ");
        int heure = scanner.nextInt();

        System.out.print("Choisissez la langue ('f' pour français, 'a' pour anglais) : ");
        char choixLangue = scanner.next().charAt(0);

        scanner.close();

        if (choixLangue == 'f') {
            afficherMessageFrancais(heure);
        } else if (choixLangue == 'a') {
            afficherMessageAnglais(heure);
        } else {
            System.out.println("Choix de langue invalide. Veuillez choisir 'f' pour français ou 'a' pour anglais.");
        }
    }

    private static void afficherMessageFrancais(int heure) {
        if (heure >= 0 && heure < 18) {
            System.out.println("Bonjour");
        } else if (heure >= 18 && heure <= 22) {
            System.out.println("Bonsoir");
        } else {
            System.out.println("Bonne nuit");
        }
    }

    private static void afficherMessageAnglais(int heure) {
        if (heure >= 0 && heure < 18) {
            System.out.println("Good Morning");
        } else if (heure >= 18 && heure <= 22) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }
    }
}
