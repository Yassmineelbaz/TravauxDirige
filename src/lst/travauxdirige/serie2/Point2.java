package lst.travauxdirige.serie2;
//Exercice2 td2
public class Point2 {

        // Attributs de la classe
        private double abscisse;
        private double ordonnee;

        // Constructeur par défaut
        public Point2() {
            this.abscisse = 0.0;
            this.ordonnee = 0.0;
        }

        // Constructeur d'initialisation
        public Point2(double abscisse, double ordonnee) {
            this.abscisse = abscisse;
            this.ordonnee = ordonnee;
        }

        // Getter et Setter pour l'abscisse
        public double getAbscisse() {
            return abscisse;
        }

        public void setAbscisse(double abscisse) {
            this.abscisse = abscisse;
        }

        // Getter et Setter pour l'ordonnee
        public double getOrdonnee() {
            return ordonnee;
        }

        public void setOrdonnee(double ordonnee) {
            this.ordonnee = ordonnee;
        }

        // Méthode pour calculer la norme du point (distance à l'origine)
        public double norme() {
            return Math.sqrt(abscisse * abscisse + ordonnee * ordonnee);
        }

        // Méthode main pour tester la classe
        public static void main(String[] args) {
            // Création d'un point avec le constructeur par défaut
            Point2 point1 = new Point2();

            // Affichage des coordonnées du point1
            System.out.println("Point1 - Abscisse: " + point1.getAbscisse() + ", Ordonnee: " + point1.getOrdonnee());

            // Modification des coordonnées du point1
            point1.setAbscisse(3.0);
            point1.setOrdonnee(4.0);

            // Affichage des nouvelles coordonnées du point1
            System.out.println("Point1 - Abscisse: " + point1.getAbscisse() + ", Ordonnee: " + point1.getOrdonnee());

            // Calcul de la norme du point1
            System.out.println("Norme du Point1: " + point1.norme());

            // Création d'un point avec le constructeur d'initialisation
            Point2 point2 = new Point2(1.0, 2.0);

            // Affichage des coordonnées du point2
            System.out.println("Point2 - Abscisse: " + point2.getAbscisse() + ", Ordonnee: " + point2.getOrdonnee());

            // Calcul de la norme du point2
            System.out.println("Norme du Point2: " + point2.norme());
        }
    }
