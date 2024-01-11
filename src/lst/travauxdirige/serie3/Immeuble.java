package lst.travauxdirige.serie3;

class Immeuble extends Batiment {
    private int nbAppart;

    // Constructeurs de la classe Immeuble
    public Immeuble() {
        super();
        this.nbAppart = 0;
    }

    public Immeuble(String adresse, int nbAppart) {
        super(adresse);
        this.nbAppart = nbAppart;
    }

    // Accesseurs et mutateurs pour l'attribut nbAppart
    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    // Méthode toString pour afficher une représentation de l'Immeuble
    @Override
    public String toString() {
        return super.toString() + ", Immeuble - Nb Appartements : " + nbAppart;
    }
}

