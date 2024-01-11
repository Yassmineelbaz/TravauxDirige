package lst.travauxdirige.serie3;

public class TestFigure {
    public static void main(String[] args) {
        Point centreDisque = new Point(2, 3);
        Disque disque = new Disque(centreDisque, 5.0, "Grand Disque");

        System.out.println(disque);
        System.out.println("Périmètre : " + disque.getPerimeter());
        System.out.println("Aire : " + disque.getAire());

        Rectangle rectangle = new Rectangle(4.0, 6.0, "Grand Rectangle");

        System.out.println("\n" + rectangle);
        System.out.println("Périmètre : " + rectangle.getPerimeter());
        System.out.println("Aire : " + rectangle.getAire());
    }
}
