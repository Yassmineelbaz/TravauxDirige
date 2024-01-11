package lst.travauxdirige.serie3;

class Centre extends Point {
    private char nom;

    // Constructeur de la classe Centre
    public Centre(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }

    // Méthode pour afficher le nom d'un objet de type Centre
    public void affNom() {
        System.out.println("Nom : " + nom);
    }

    // Méthode pour afficher les coordonnées d'un objet de type Centre
    @Override
    public void affCoord() {
        super.affCoord();  // Appelle la méthode affCoord de la classe Point
        affNom();
    }
}

