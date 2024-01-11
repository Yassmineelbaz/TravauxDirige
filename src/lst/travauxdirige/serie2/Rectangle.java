package lst.travauxdirige.serie2;

public class Rectangle {

        // Attributs de la classe
        private double longueur;
        private double largeur;

        // Constructeur par défaut
        public Rectangle() {
            this.longueur = 0.0;
            this.largeur = 0.0;
        }

        // Constructeur avec longueur et largeur
        public Rectangle(double longueur, double largeur) {
            this.longueur = longueur;
            this.largeur = largeur;
        }

        // Constructeur de copie
        public Rectangle(Rectangle rectangle) {
            this.longueur = rectangle.longueur;
            this.largeur = rectangle.largeur;
        }

        // Accesseurs et mutateurs pour longueur et largeur (positifs)
        public double getLongueur() {
            return longueur;
        }

        public void setLongueur(double longueur) {
            if (longueur > 0) {
                this.longueur = longueur;
            } else {
                System.out.println("Erreur : La longueur doit être positive.");
            }
        }

        public double getLargeur() {
            return largeur;
        }

        public void setLargeur(double largeur) {
            if (largeur > 0) {
                this.largeur = largeur;
            } else {
                System.out.println("Erreur : La largeur doit être positive.");
            }
        }

        // Méthode pour calculer le périmètre du rectangle
        public double perimetre() {
            return 2 * (longueur + largeur);
        }

        // Méthode pour calculer l'aire du rectangle
        public double aire() {
            return longueur * largeur;
        }

        // Méthode pour vérifier si le rectangle est un carré
        public boolean isCarre() {
            return longueur == largeur;
        }

        // Méthode toString pour afficher une représentation du rectangle
        @Override
        public String toString() {
            return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
        }
    }


