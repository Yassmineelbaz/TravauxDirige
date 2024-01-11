package lst.travauxdirige.serie2;

//Exercice 1 td2
public class Point1 {

    private char nom;
    private double abscisse;


    public Point1(char nom, double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;
    }


    public void affiche() {
        System.out.println("Point " + nom + " : Abscisse = " + abscisse);
    }


    public void translate(double deplacement) {
        abscisse += deplacement;
    }


    public static void main(String[] args) {

        Point1 pointA = new Point1('A', 7.0);


        pointA.affiche();


        pointA.translate(9.3);


        pointA.affiche();
    }
}

