package lst.travauxdirige.serie2;

public class Mainlivre {
    public static void main(String[] args) {
        // Création d'un livre avec le constructeur par défaut
        Livre livre1 = new Livre();
        System.out.println("Livre1 (par défaut): " + livre1);

        // Création d'un livre avec le constructeur avec titre
        Livre livre2 = new Livre("Java Programming");
        System.out.println("Livre2 (avec titre): " + livre2);

        // Création d'un livre avec le constructeur avec titre et auteur
        Livre livre3 = new Livre("Clean Code", "Robert C. Martin");
        System.out.println("Livre3 (avec titre et auteur): " + livre3);

        // Création d'un livre avec le constructeur avec titre, auteur et prix
        Livre livre4 = new Livre("The Pragmatic Programmer", "Andrew Hunt, David Thomas", 29.99);
        System.out.println("Livre4 (avec titre, auteur et prix): " + livre4);

        // Création d'un livre avec le constructeur avec titre, auteur, prix et annee
        Livre livre5 = new Livre("Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", 49.99, 1994);
        System.out.println("Livre5 (avec titre, auteur, prix et annee): " + livre5);

        // Création d'un livre en utilisant le constructeur de copie
        Livre livre6 = new Livre(livre5);
        System.out.println("Livre6 (copie de Livre5): " + livre6);

        // Modification du titre du livre6
        livre6.setTitre("Head First Design Patterns");
        System.out.println("Livre6 après modification du titre: " + livre6);
    }
}
