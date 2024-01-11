package lst.travauxdirige.serie3;

class Triporteur extends Moto {
    private int nbTriporteur;

    // Constructeur Triporteur avec deux paramètres
    public Triporteur(int nbP, int nbT) {
        super(nbP);
        this.nbTriporteur = nbT;
    }
}