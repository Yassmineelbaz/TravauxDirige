package lst.travauxdirige.serie2;

public class Maintemp {
    public static void main(String[] args) {
        // Création d'un temps avec le constructeur par défaut
        Temps temps1 = new Temps();
        System.out.println("Temps1 (par défaut): " + temps1);

        // Création d'un temps avec le constructeur avec heures
        Temps temps2 = new Temps(12);
        System.out.println("Temps2 (avec heures): " + temps2);

        // Création d'un temps avec le constructeur avec heures et minutes
        Temps temps3 = new Temps(8, 30);
        System.out.println("Temps3 (avec heures et minutes): " + temps3);

        // Création d'un temps avec le constructeur avec heures, minutes et secondes
        Temps temps4 = new Temps(15, 45, 30);
        System.out.println("Temps4 (avec heures, minutes et secondes): " + temps4);

        // Création d'un temps en utilisant le constructeur de copie
        Temps temps5 = new Temps(temps4);
        System.out.println("Temps5 (copie de Temps4): " + temps5);

        // Modification des heures, minutes et secondes du temps5
        temps5.setHeures(22);
        temps5.setMinutes(55);
        temps5.setSecondes(45);
        System.out.println("Temps5 après modification : " + temps5);

        // Ajout de heures, minutes et secondes au temps5
        temps5.ajouterHeures(3);
        temps5.ajouterMinutes(20);
        temps5.ajouterSecondes(15);
        System.out.println("Temps5 après ajout : " + temps5);
    }
}
