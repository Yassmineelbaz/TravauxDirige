package lst.travauxdirige.serie3;


class PointNom extends Point {
    private char nom;

    public PointNom(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }

    public void setPointNom(int x, int y, char nom) {
        super.deplace(x - super.getX(), y - super.getY());
        this.nom = nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public void affCoordNom() {
        System.out.println("Coordonnees : " + super.getX() + " " + super.getY());
        System.out.println("Nom : " + nom);
    }
}
