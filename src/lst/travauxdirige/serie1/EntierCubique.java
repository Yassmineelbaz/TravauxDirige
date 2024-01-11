package lst.travauxdirige.serie1;
public class EntierCubique {
    public static void main(String[] args) {
        // Chercher et afficher tous les entiers cubiques de trois chiffres
        chercherEntiersCubiques();
    }

    private static void chercherEntiersCubiques() {
        for (int i = 100; i <= 999; i++) {
            // Extraire les chiffres du nombre
            int centaines = i / 100;
            int dizaines = (i / 10) % 10;
            int unites = i % 10;

            // Vérifier si le nombre est cubique
            if (i == (Math.pow(centaines, 3) + Math.pow(dizaines, 3) + Math.pow(unites, 3))) {
                System.out.println(i + " est un entier cubique.");
            }
        }
    }
}
