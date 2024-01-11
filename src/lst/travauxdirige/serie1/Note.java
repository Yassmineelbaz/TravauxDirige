package lst.travauxdirige.serie1;
import java.util.Scanner;
public class Note {

    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées au clavier
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer la moyenne de l'étudiant
        System.out.print("Entrez la moyenne de l'étudiant : ");
        double moyenne = scanner.nextDouble();

        // Fermer le scanner pour éviter les fuites de ressources
        scanner.close();

        // Déterminer la mention en fonction de la moyenne
        String mention = determinerMention(moyenne);

        // Afficher la mention
        System.out.println("Mention : " + mention);
    }

    // Méthode pour déterminer la mention en fonction de la moyenne
    private static String determinerMention(double moyenne) {
        if (moyenne >= 16) {
            return "Très Bien";
        } else if (moyenne >= 14) {
            return "Bien";
        } else if (moyenne >= 12) {
            return "Assez Bien";
        } else if (moyenne >= 10) {
            return "Passable";
        } else {
            return "Insuffisant";
        }
    }
}
