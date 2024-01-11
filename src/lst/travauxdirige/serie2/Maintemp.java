package lst.travauxdirige.serie2;

public class Maintemp {
    public static void main(String[] args) {
        Temps temps1 = new Temps();
        System.out.println("Temps1 (par défaut): " + temps1);

        Temps temps2 = new Temps(12);
        System.out.println("Temps2 (avec heures): " + temps2);

        Temps temps3 = new Temps(8, 30);
        System.out.println("Temps3 (avec heures et minutes): " + temps3);

        Temps temps4 = new Temps(15, 45, 30);
        System.out.println("Temps4 (avec heures, minutes et secondes): " + temps4);

        Temps temps5 = new Temps(temps4);
        System.out.println("Temps5 (copie de Temps4): " + temps5);

        temps5.setHeures(22);
        temps5.setMinutes(55);
        temps5.setSecondes(45);
        System.out.println("Temps5 après modification : " + temps5);

        temps5.ajouterHeures(3);
        temps5.ajouterMinutes(20);
        temps5.ajouterSecondes(15);
        System.out.println("Temps5 après ajout : " + temps5);
    }
}
