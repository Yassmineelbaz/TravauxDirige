package lst.travauxdirige.serie2;
//Exercice2 td2
public class Point2 {

        private double abscisse;
        private double ordonnee;

        public Point2() {
            this.abscisse = 0.0;
            this.ordonnee = 0.0;
        }

        public Point2(double abscisse, double ordonnee) {
            this.abscisse = abscisse;
            this.ordonnee = ordonnee;
        }

        public double getAbscisse() {
            return abscisse;
        }

        public void setAbscisse(double abscisse) {
            this.abscisse = abscisse;
        }

        public double getOrdonnee() {
            return ordonnee;
        }

        public void setOrdonnee(double ordonnee) {
            this.ordonnee = ordonnee;
        }

        public double norme() {
            return Math.sqrt(abscisse * abscisse + ordonnee * ordonnee);
        }

        public static void main(String[] args) {
            Point2 point1 = new Point2();

            System.out.println("Point1 - Abscisse: " + point1.getAbscisse() + ", Ordonnee: " + point1.getOrdonnee());

            point1.setAbscisse(3.0);
            point1.setOrdonnee(4.0);

            System.out.println("Point1 - Abscisse: " + point1.getAbscisse() + ", Ordonnee: " + point1.getOrdonnee());

            System.out.println("Norme du Point1: " + point1.norme());

            Point2 point2 = new Point2(1.0, 2.0);

            System.out.println("Point2 - Abscisse: " + point2.getAbscisse() + ", Ordonnee: " + point2.getOrdonnee());

            System.out.println("Norme du Point2: " + point2.norme());
        }
    }
