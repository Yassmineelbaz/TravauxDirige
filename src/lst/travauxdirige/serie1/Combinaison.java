package lst.travauxdirige.serie1;

public class Combinaison {
    public static void main(String[] args) {
        int total = 15;

        System.out.println("Les combinaisons pour obtenir un total de " + total + " sont :");
        trouverCombinaisons(total);
    }

    private static void trouverCombinaisons(int total) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    if (i + j + k == total) {
                        System.out.println(i + " + " + j + " + " + k + " = " + total);
                    }
                }
            }
        }
    }

}
