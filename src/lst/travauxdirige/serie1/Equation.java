package lst.travauxdirige.serie1;
import java.util.Scanner;
public class Equation {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées au clavier
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer les coefficients de l'équation quadratique
        System.out.print("Entrez la valeur de a : ");
        double a = scanner.nextDouble();

        System.out.print("Entrez la valeur de b : ");
        double b = scanner.nextDouble();

        System.out.print("Entrez la valeur de c : ");
        double c = scanner.nextDouble();

        // Fermer le scanner pour éviter les fuites de ressources
        scanner.close();

        // Calculer le discriminant
        double discriminant = b * b - 4 * a * c;

        // Vérifier le nombre de solutions en fonction du discriminant
        if (discriminant > 0) {
            // Deux solutions réelles distinctes
            double racine1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double racine2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Deux solutions réelles distinctes : ");
            System.out.println("Racine 1 = " + racine1);
            System.out.println("Racine 2 = " + racine2);
        } else if (discriminant == 0) {
            // Une seule solution réelle (racine double)
            double racine = -b / (2 * a);

            System.out.println("Une seule solution réelle (racine double) : ");
            System.out.println("Racine = " + racine);
        } else {
            // Pas de solution réelle (racines complexes)
            double partieReelle = -b / (2 * a);
            double partieImaginaire = Math.sqrt(Math.abs(discriminant)) / (2 * a);

            System.out.println("Pas de solution réelle (racines complexes) : ");
            System.out.println("Partie réelle = " + partieReelle + " + " + partieImaginaire + "i");
            System.out.println("Partie réelle = " + partieReelle + " - " + partieImaginaire + "i");
        }
    }
}
