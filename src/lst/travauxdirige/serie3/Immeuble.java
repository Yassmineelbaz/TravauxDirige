package lst.travauxdirige.serie3;

class Immeuble extends Batiment {
    private int nbAppart;

   
    public Immeuble() {
        super();
        this.nbAppart = 0;
    }

    public Immeuble(String adresse, int nbAppart) {
        super(adresse);
        this.nbAppart = nbAppart;
    }

    
    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }


    @Override
    public String toString() {
        return super.toString() + ", Immeuble - Nb Appartements : " + nbAppart;
    }
}

