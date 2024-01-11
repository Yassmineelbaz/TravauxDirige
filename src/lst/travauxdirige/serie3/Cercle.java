package lst.travauxdirige.serie3;


class Cercle extends Centre {
    private double rayon;

    // Constructeur de la classe Cercle
    public Cercle(int x, int y, char nom, double rayon) {
        super(x, y, nom);
        this.rayon = rayon;
    }

    // Méthode pour afficher les informations du cercle
    @Override
    public void affCoord() {
        super.affCoord();  // Appelle la méthode affCoord de la classe Centre
        System.out.println("Rayon : " + rayon);
    }

    // Méthode pour calculer l'aire du cercle
    public double aire() {
        return Math.PI * rayon * rayon;
    }
}


