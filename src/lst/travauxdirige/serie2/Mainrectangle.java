package lst.travauxdirige.serie2;

public class Mainrectangle {
    public static void main(String[] args) {
        // Création d'un rectangle avec le constructeur par défaut
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle1 (par défaut): " + rectangle1);

        // Modification de la longueur et de la largeur du rectangle1
        rectangle1.setLongueur(5.0);
        rectangle1.setLargeur(3.0);
        System.out.println("Rectangle1 après modification : " + rectangle1);

        // Création d'un rectangle avec le constructeur avec longueur et largeur
        Rectangle rectangle2 = new Rectangle(8.0, 8.0);
        System.out.println("Rectangle2 (avec longueur et largeur): " + rectangle2);

        // Création d'un rectangle en utilisant le constructeur de copie
        Rectangle rectangle3 = new Rectangle(rectangle2);
        System.out.println("Rectangle3 (copie de Rectangle2): " + rectangle3);

        // Vérification si rectangle2 est un carré
        System.out.println("Rectangle2 est un carré : " + rectangle2.isCarre());

        // Calcul du périmètre et de l'aire du rectangle3
        System.out.println("Périmètre de Rectangle3 : " + rectangle3.perimetre());
        System.out.println("Aire de Rectangle3 : " + rectangle3.aire());
    }

}
