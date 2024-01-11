package lst.travauxdirige.serie3;

public class Maincentre {
    public static void main(String[] args) {
        Centre centre = new Centre(1, 2, 'A');

        centre.affCoord();

        Cercle cercle = new Cercle(3, 4, 'B', 5.0);

        cercle.affCoord();

        System.out.println("Aire du cercle : " + cercle.aire());
    }
}
