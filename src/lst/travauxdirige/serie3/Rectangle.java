package lst.travauxdirige.serie3;

class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    // Constructeurs de la classe Rectangle
    public Rectangle() {
        super("Rectangle");
        this.longueur = 1.0;
        this.largeur = 1.0;
    }

    public Rectangle(double longueur, double largeur) {
        super("Rectangle");
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(double longueur, double largeur, String nom) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Accesseurs et mutateurs pour les attributs de Rectangle
    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    // Implémentation des méthodes abstraites de la classe Figure
    @Override
    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double getAire() {
        return longueur * largeur;
    }

    // Méthode toString pour afficher une représentation du Rectangle
    @Override
    public String toString() {
        return super.toString() + ", Longueur : " + longueur + ", Largeur : " + largeur;
    }
}

