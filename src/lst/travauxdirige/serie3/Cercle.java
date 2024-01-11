package lst.travauxdirige.serie3;


class Cercle extends Centre {
    private double rayon;

   
    public Cercle(int x, int y, char nom, double rayon) {
        super(x, y, nom);
        this.rayon = rayon;
    }

    
    @Override
    public void affCoord() {
        super.affCoord();  // Appelle la méthode affCoord de la classe Centre
        System.out.println("Rayon : " + rayon);
    }

    
    public double aire() {
        return Math.PI * rayon * rayon;
    }
}


