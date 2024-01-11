package lst.travauxdirige.serie1;
import java.util.Scanner;
public class Horaire {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées au clavier
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer l'heure
        System.out.print("Entrez l'heure (format 24 heures) : ");
        int heure = scanner.nextInt();

        // Demander à l'utilisateur de choisir la langue
        System.out.print("Choisissez la langue ('f' pour français, 'a' pour anglais) : ");
        char choixLangue = scanner.next().charAt(0);

        // Fermer le scanner pour éviter les fuites de ressources
        scanner.close();

        // Afficher le message approprié en fonction de l'heure et de la langue
        if (choixLangue == 'f') {
            afficherMessageFrancais(heure);
        } else if (choixLangue == 'a') {
            afficherMessageAnglais(heure);
        } else {
            System.out.println("Choix de langue invalide. Veuillez choisir 'f' pour français ou 'a' pour anglais.");
        }
    }

    // Méthode pour afficher le message en français en fonction de l'heure
    private static void afficherMessageFrancais(int heure) {
        if (heure >= 0 && heure < 18) {
            System.out.println("Bonjour");
        } else if (heure >= 18 && heure <= 22) {
            System.out.println("Bonsoir");
        } else {
            System.out.println("Bonne nuit");
        }
    }

    // Méthode pour afficher le message en anglais en fonction de l'heure
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
