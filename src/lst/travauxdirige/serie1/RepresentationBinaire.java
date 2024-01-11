package lst.travauxdirige.serie1;
import java.util.Scanner;



    public class RepresentationBinaire {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Demander à l'utilisateur de saisir un entier
            System.out.print("Entrez un entier N : ");
            int N = scanner.nextInt();

            // Afficher la représentation binaire de N
            String representationBinaire = convertirEnBinaire(N);
            System.out.println("La représentation binaire de " + N + " est : " + representationBinaire);

            scanner.close();
        }

        private static String convertirEnBinaire(int nombre) {
            if (nombre == 0) {
                return "0";
            }

            StringBuilder binaire = new StringBuilder();
            while (nombre > 0) {
                int reste = nombre % 2;
                binaire.insert(0, reste); // Insérer le reste au début de la chaîne
                nombre /= 2;
            }

            return binaire.toString();
        }
    }

