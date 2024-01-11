package lst.travauxdirige.serie3;

class Maison extends Batiment {
    private int nbChambres;

    // Constructeurs de la classe Maison
    public Maison() {
        super();
        this.nbChambres = 0;
    }

    public Maison(String adresse, int nbChambres) {
        super(adresse);
        this.nbChambres = nbChambres;
    }

    // Accesseurs et mutateurs pour l'attribut nbChambres
    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    // Méthode toString pour afficher une représentation de la Maison
    @Override
    public String toString() {
        return super.toString() + ", Maison - Nb Chambres : " + nbChambres;
    }
}

