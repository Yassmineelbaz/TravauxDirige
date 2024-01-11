package lst.travauxdirige.serie3;

public class Maincentre {
    public static void main(String[] args) {
        // Création d'un objet Centre
        Centre centre = new Centre(1, 2, 'A');

        // Affichage des coordonnées de l'objet Centre
        centre.affCoord();

        // Création d'un objet Cercle
        Cercle cercle = new Cercle(3, 4, 'B', 5.0);

        // Affichage des informations du cercle (coordonnées, nom, rayon)
        cercle.affCoord();

        // Affichage de l'aire du cercle
        System.out.println("Aire du cercle : " + cercle.aire());
    }
}
