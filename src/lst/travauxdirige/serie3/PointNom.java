package lst.travauxdirige.serie3;


class PointNom extends Point {
    private char nom;

    // Constructeur de la classe PointNom
    public PointNom(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }

    // Méthode pour définir les coordonnées et le nom
    public void setPointNom(int x, int y, char nom) {
        super.deplace(x - super.getX(), y - super.getY());
        this.nom = nom;
    }

    // Méthode pour définir seulement le nom
    public void setNom(char nom) {
        this.nom = nom;
    }

    // Méthode pour afficher les coordonnées et le nom
    public void affCoordNom() {
        System.out.println("Coordonnees : " + super.getX() + " " + super.getY());
        System.out.println("Nom : " + nom);
    }
}