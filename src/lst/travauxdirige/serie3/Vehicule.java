package lst.travauxdirige.serie3;

public class Vehicule {
    private int nbPassager;

    public Vehicule(int nbPassager) {
        this.nbPassager = nbPassager;
    }

    @Override
    public String toString() {
        return "Nombre de passagers : " + nbPassager;
    }
}
