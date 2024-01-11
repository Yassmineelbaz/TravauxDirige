package lst.travauxdirige.serie2;

public class Banque {

        // Attributs de la classe
        private int Ncompte;
        private float solde;
        private String CIN;

        // Constructeur
        public Banque(int Ncompte, float solde, String CIN) {
            this.Ncompte = Ncompte;
            this.solde = solde;
            this.CIN = CIN;
        }

        // Méthode pour déposer de l'argent
        public void deposer(float somme) {
            if (somme > 0) {
                solde += somme;
                System.out.println("Dépôt de " + somme + " effectué avec succès.");
            } else {
                System.out.println("Erreur : La somme à déposer doit être positive.");
            }
        }

        // Méthode pour retirer de l'argent
        public void retirer(float somme) {
            if (somme > 0 && somme <= solde) {
                solde -= somme;
                System.out.println("Retrait de " + somme + " effectué avec succès.");
            } else {
                System.out.println("Erreur : La somme à retirer doit être positive et ne doit pas dépasser le solde.");
            }
        }

        // Méthode pour obtenir le solde du compte
        public float avoirSolde() {
            return solde;
        }

        // Méthode pour obtenir les informations du compte
        public void avoirInf() {
            System.out.println("Informations du compte - Ncompte: " + Ncompte + ", Solde: " + solde + ", CIN: " + CIN);
        }
}

