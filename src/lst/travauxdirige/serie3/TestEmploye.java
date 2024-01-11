package lst.travauxdirige.serie3;


    public class TestEmploye {
        public static void main(String[] args) {
            Patron patron = new Patron("Dupont", "Jean", 5000.0);

            System.out.println(patron);
            System.out.println("Salaire du patron : " + patron.gains());

            TravailleurCommission travailleurCommission = new TravailleurCommission("Martin", "Alice", 1000.0, 0.05);
            travailleurCommission.setQuantite(200);

            System.out.println("\n" + travailleurCommission);
            System.out.println("Salaire du travailleur à la commission : " + travailleurCommission.gains());

            TravailleurHoraire travailleurHoraire = new TravailleurHoraire("Dubois", "Paul", 15.0);
            travailleurHoraire.setHeures(40);

            System.out.println("\n" + travailleurHoraire);
            System.out.println("Salaire du travailleur horaire : " + travailleurHoraire.gains());
        }
    }
