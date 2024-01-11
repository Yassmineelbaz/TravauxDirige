package lst.travauxdirige.serie2;

public class Rectangle {

        private double longueur;
        private double largeur;

        public Rectangle() {
            this.longueur = 0.0;
            this.largeur = 0.0;
        }

        public Rectangle(double longueur, double largeur) {
            this.longueur = longueur;
            this.largeur = largeur;
        }

        public Rectangle(Rectangle rectangle) {
            this.longueur = rectangle.longueur;
            this.largeur = rectangle.largeur;
        }

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

        public double perimetre() {
            return 2 * (longueur + largeur);
        }

        public double aire() {
            return longueur * largeur;
        }

        public boolean isCarre() {
            return longueur == largeur;
        }

        @Override
        public String toString() {
            return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
        }
    }


