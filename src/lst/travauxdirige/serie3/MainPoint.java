package lst.travauxdirige.serie3;
//EX1TD3
public class MainPoint {
    public static void main(String[] args) {
        // Utilisation de la classe Point
        Point point = new Point(1, 2);
        point.deplace(3, 4);
        System.out.println("Coordonnées du point (Point) : (" + point.getX() + ", " + point.getY() + ")");

        // Utilisation de la classe PointA
        PointA pointA = new PointA(5, 6);
        pointA.deplace(2, 2);
        pointA.affiche();
    }
    /*Concernant la question de ce qui se passerait si
    la classe Point ne disposait pas des méthodes getX et getY,
     cela entraînerait une erreur de compilation dans la classe PointA
     lorsqu'elle essaie d'appeler ces méthodes. La classe dérivée PointA
     utilise ces méthodes pour afficher les coordonnées du point dans sa méthode
     affiche. Si ces méthodes n'étaient pas présentes dans la classe de base Point,
     la classe dérivée ne pourrait pas les utiliser, ce qui causerait une erreur de
     compilation.
     */
}
