package lst.travauxdirige.serie3;

public class MainPointnom {
    public static void main(String[] args) {
        PointNom pointA = new PointNom(1, 2, 'A');

        pointA.affCoordNom();

        pointA.setPointNom(5, 7, 'B');

        pointA.affCoordNom();

        pointA.setNom('C');

        pointA.affCoordNom();
    }
}
