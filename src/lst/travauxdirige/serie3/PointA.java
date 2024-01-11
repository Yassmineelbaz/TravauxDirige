package lst.travauxdirige.serie3;
//EX1TD3
class PointA extends Point {
    public PointA(int x, int y) {
        super(x, y);
    }

    public void affiche() {
        System.out.println("Coordonnées du point : (" + getX() + ", " + getY() + ")");
    }

}
