package lst.travauxdirige.serie2;

public class Livre {
        // Attributs de la classe
        private String titre;
        private String auteur;
        private double prix;
        private int annee;

        // Constructeur par défaut
        public Livre() {
            this.titre = "";
            this.auteur = "";
            this.prix = 0.0;
            this.annee = 0;
        }

        // Constructeur avec titre
        public Livre(String titre) {
            this.titre = titre;
            this.auteur = "";
            this.prix = 0.0;
            this.annee = 0;
        }

        // Constructeur avec titre et auteur
        public Livre(String titre, String auteur) {
            this.titre = titre;
            this.auteur = auteur;
            this.prix = 0.0;
            this.annee = 0;
        }

        // Constructeur avec titre, auteur et prix
        public Livre(String titre, String auteur, double prix) {
            this.titre = titre;
            this.auteur = auteur;
            this.prix = prix;
            this.annee = 0;
        }

        // Constructeur avec titre, auteur, prix et annee
        public Livre(String titre, String auteur, double prix, int annee) {
            this.titre = titre;
            this.auteur = auteur;
            this.prix = prix;
            this.annee = annee;
        }

        // Constructeur de copie
        public Livre(Livre livre) {
            this.titre = livre.titre;
            this.auteur = livre.auteur;
            this.prix = livre.prix;
            this.annee = livre.annee;
        }

        // Accesseurs et mutateurs pour tous les attributs
        public String getTitre() {
            return titre;
        }

        public void setTitre(String titre) {
            this.titre = titre;
        }

        public String getAuteur() {
            return auteur;
        }

        public void setAuteur(String auteur) {
            this.auteur = auteur;
        }

        public double getPrix() {
            return prix;
        }

        public void setPrix(double prix) {
            this.prix = prix;
        }

        public int getAnnee() {
            return annee;
        }

        public void setAnnee(int annee) {
            this.annee = annee;
        }

        // Méthode toString pour afficher une représentation de la classe Livre
        @Override
        public String toString() {
            return "Livre [titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + ", annee=" + annee + "]";
        }
    }


