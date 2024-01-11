package lst.travauxdirige.serie2;

public class Mainrectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle1 (par défaut): " + rectangle1);

        rectangle1.setLongueur(5.0);
        rectangle1.setLargeur(3.0);
        System.out.println("Rectangle1 après modification : " + rectangle1);

        Rectangle rectangle2 = new Rectangle(8.0, 8.0);
        System.out.println("Rectangle2 (avec longueur et largeur): " + rectangle2);

        Rectangle rectangle3 = new Rectangle(rectangle2);
        System.out.println("Rectangle3 (copie de Rectangle2): " + rectangle3);

        System.out.println("Rectangle2 est un carré : " + rectangle2.isCarre());

        System.out.println("Périmètre de Rectangle3 : " + rectangle3.perimetre());
        System.out.println("Aire de Rectangle3 : " + rectangle3.aire());
    }

}
