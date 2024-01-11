package lst.travauxdirige.serie2;

public class Mainbanque {
    public static void main(String[] args) {
        Banque compte1 = new Banque(1, 5000.75f, "AB 1200");

        compte1.avoirInf();

        System.out.println("Solde du compte: " + compte1.avoirSolde());

        compte1.deposer(500);

        compte1.avoirInf();

        System.out.println("Solde du compte après le dépôt: " + compte1.avoirSolde());

        compte1.retirer(200);

        compte1.avoirInf();

        System.out.println("Solde du compte après le retrait: " + compte1.avoirSolde());
    }
}
