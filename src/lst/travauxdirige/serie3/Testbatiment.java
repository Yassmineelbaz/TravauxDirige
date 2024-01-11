package lst.travauxdirige.serie3;

public class Testbatiment {
    public static void main(String[] args) {
        Batiment batiment1 = new Batiment();
        Batiment batiment2 = new Batiment("123 Rue de la Ville");

        System.out.println("Batiment1 : " + batiment1);
        System.out.println("Batiment2 : " + batiment2);

        Maison maison1 = new Maison();
        Maison maison2 = new Maison("456 Avenue du Quartier", 3);

        System.out.println("\nMaison1 : " + maison1);
        System.out.println("Maison2 : " + maison2);

        Immeuble immeuble1 = new Immeuble();
        Immeuble immeuble2 = new Immeuble("789 Boulevard de la Ville", 10);

        System.out.println("\nImmeuble1 : " + immeuble1);
        System.out.println("Immeuble2 : " + immeuble2);
    }
}
