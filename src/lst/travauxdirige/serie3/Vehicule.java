package lst.travauxdirige.serie3;

public class Vehicule {
    private int nbPassager;

    // Constructeur de la classe Vehicule
    public Vehicule(int nbPassager) {
        this.nbPassager = nbPassager;
    }

    // Méthode toString pour afficher le nombre de passagers
    @Override
    public String toString() {
        return "Nombre de passagers : " + nbPassager;
    }
}
