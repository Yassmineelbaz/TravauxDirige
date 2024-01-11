package lst.travauxdirige.serie3;

class Avion extends Vehicule {
    private int nbMoteur;

    // Constructeur Avion avec un seul paramètre
    public Avion(int nbP) {
        super(nbP); // Appel du constructeur de la classe Vehicule
    }

    // Constructeur Avion avec deux paramètres
    public Avion(int nbP, int nbM) {
        super(nbP);
        this.nbMoteur = nbM;
    }
}
