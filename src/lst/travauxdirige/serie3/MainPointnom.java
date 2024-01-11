package lst.travauxdirige.serie3;

public class MainPointnom {
    public static void main(String[] args) {
        // Création d'un point avec le nom 'A'
        PointNom pointA = new PointNom(1, 2, 'A');

        // Affichage des coordonnées et du nom du pointA
        pointA.affCoordNom();

        // Déplacement du pointA et changement de nom
        pointA.setPointNom(5, 7, 'B');

        // Affichage des nouvelles coordonnées et du nom du pointA
        pointA.affCoordNom();

        // Changement du nom du pointA
        pointA.setNom('C');

        // Affichage des coordonnées et du nouveau nom du pointA
        pointA.affCoordNom();
    }
    /*Ce programme crée un objet PointNom
     avec des coordonnées initiales et un nom,
      affiche les coordonnées et le nom, déplace le point et
      change son nom, puis affiche les nouvelles coordonnées et le nouveau nom.
       Enfin, il change
    à nouveau le nom du point et affiche les coordonnées avec le nouveau nom.
     */
}
