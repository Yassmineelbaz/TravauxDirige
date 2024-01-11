package lst.travauxdirige.serie3;

class Avion extends Vehicule {
    private int nbMoteur;

   
    public Avion(int nbP) {
        super(nbP); 
    }

    
    public Avion(int nbP, int nbM) {
        super(nbP);
        this.nbMoteur = nbM;
    }
}
