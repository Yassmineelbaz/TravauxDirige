package lst.travauxdirige.serie3;
//EX1TD3
public class MainPoint {
    public static void main(String[] args) {
        
        Point point = new Point(1, 2);
        point.deplace(3, 4);
        System.out.println("Coordonnées du point (Point) : (" + point.getX() + ", " + point.getY() + ")");

        
        PointA pointA = new PointA(5, 6);
        pointA.deplace(2, 2);
        pointA.affiche();
    }
}
