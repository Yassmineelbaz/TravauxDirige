package lst.travauxdirige.serie2;

public class Mainbanque {
    public static void main(String[] args) {
        // Création d'un compte
        Banque compte1 = new Banque(1, 5000.75f, "AB 1200");

        // Affichage des informations du compte
        compte1.avoirInf();

        // Affichage du solde du compte
        System.out.println("Solde du compte: " + compte1.avoirSolde());

        // Déposer de l'argent
        compte1.deposer(500);

        // Affichage des informations du compte après le dépôt
        compte1.avoirInf();

        // Affichage du solde du compte après le dépôt
        System.out.println("Solde du compte après le dépôt: " + compte1.avoirSolde());

        // Retirer de l'argent
        compte1.retirer(200);

        // Affichage des informations du compte après le retrait
        compte1.avoirInf();

        // Affichage du solde du compte après le retrait
        System.out.println("Solde du compte après le retrait: " + compte1.avoirSolde());
    }
}
