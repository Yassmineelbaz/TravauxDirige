package lst.travauxdirige.serie3;

public class Employee {
    // Interface Employe
    interface Employe {
        String getNom();
        String getPrenom();
        double gains();
        String toString();
    }

    // Classe Patron implémentant l'interface Employe
    class Patron implements Employe {
        private String nom;
        private String prenom;
        private double salaire;

        // Constructeurs de la classe Patron
        public Patron() {
            this.nom = "Inconnu";
            this.prenom = "Inconnu";
            this.salaire = 0.0;
        }

        public Patron(String nom, String prenom, double salaire) {
            this.nom = nom;
            this.prenom = prenom;
            this.salaire = salaire;
        }

        // Accesseurs et mutateurs pour les attributs de Patron
        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public double getSalaire() {
            return salaire;
        }

        public void setSalaire(double salaire) {
            this.salaire = salaire;
        }

        // Implémentation de la méthode gains pour le salaire du patron
        public double gains() {
            return salaire;
        }

        // Méthode toString pour afficher une représentation du patron
        public String toString() {
            return "Patron - Nom : " + nom + ", Prénom : " + prenom + ", Salaire : " + salaire;
        }
    }

    // Classe TravailleurCommission implémentant l'interface Employe
    class TravailleurCommission implements Employe {
        private String nom;
        private String prenom;
        private double salaire;
        private double commission;
        private int quantite;

        // Constructeurs de la classe TravailleurCommission
        public TravailleurCommission() {
            this.nom = "Inconnu";
            this.prenom = "Inconnu";
            this.salaire = 0.0;
            this.commission = 0.0;
            this.quantite = 0;
        }

        public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
            this.nom = nom;
            this.prenom = prenom;
            this.salaire = salaire;
            this.commission = commission;
            this.quantite = 0;
        }

        // Accesseurs et mutateurs pour les attributs de TravailleurCommission
        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public double getSalaire() {
            return salaire;
        }

        public void setSalaire(double salaire) {
            this.salaire = salaire;
        }

        public double getCommission() {
            return commission;
        }

        public void setCommission(double commission) {
            this.commission = commission;
        }

        public int getQuantite() {
            return quantite;
        }

        public void setQuantite(int quantite) {
            this.quantite = quantite;
        }

        // Implémentation de la méthode gains pour le salaire du travailleur à la commission
        public double gains() {
            return salaire + commission * quantite;
        }

        // Méthode toString pour afficher une représentation du travailleur à la commission
        public String toString() {
            return "TravailleurCommission - Nom : " + nom + ", Prénom : " + prenom +
                    ", Salaire : " + salaire + ", Commission : " + commission + ", Quantité : " + quantite;
        }
    }

    // Classe TravailleurHoraire implémentant l'interface Employe
    class TravailleurHoraire implements Employe {
        private String nom;
        private String prenom;
        private double retribution;
        private double heures;

        // Constructeurs de la classe TravailleurHoraire
        public TravailleurHoraire() {
            this.nom = "Inconnu";
            this.prenom = "Inconnu";
            this.retribution = 0.0;
            this.heures = 0.0;
        }

        public TravailleurHoraire(String nom, String prenom, double retribution) {
            this.nom = nom;
            this.prenom = prenom;
            this.retribution = retribution;
            this.heures = 0.0;
        }

        // Accesseurs et mutateurs pour les attributs de TravailleurHoraire
        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public double getRetribution() {
            return retribution;
        }

        public void setRetribution(double retribution) {
            this.retribution = retribution;
        }

        public double getHeures() {
            return heures;
        }

        public void setHeures(double heures) {
            this.heures = heures;
        }

        // Implémentation de la méthode gains pour le salaire du travailleur horaire
        public double gains() {
            return retribution * heures;
        }

        // Méthode toString pour afficher une représentation du travailleur horaire
        public String toString() {
            return "TravailleurHoraire - Nom : " + nom + ", Prénom : " + prenom +
                    ", Rémunération horaire : " + retribution + ", Heures : " + heures;
        }
    }

    // Classe de test TestEmploye
    public class TestEmploye {
        public void main(String[] args) {
            // Test de la classe Patron
            Employe patron = new Patron("Dupont", "Jean", 5000.0);
            System.out.println(patron);
            System.out.println("Salaire du patron : " + patron.gains());

            // Test de la classe TravailleurCommission
            Employe travailleurCommission = new TravailleurCommission("Martin", "Alice", 1000.0, 0.05);
            ((TravailleurCommission) travailleurCommission).setQuantite(200);
            System.out.println("\n" + travailleurCommission);
            System.out.println("Salaire du travailleur à la commission : " + travailleurCommission.gains());

            // Test de la classe TravailleurHoraire
            Employe travailleurHoraire = new TravailleurHoraire("Dubois", "Paul", 15.0);
            ((TravailleurHoraire) travailleurHoraire).setHeures(40);
            System.out.println("\n" + travailleurHoraire);
            System.out.println("Salaire du travailleur horaire : " + travailleurHoraire.gains());
        }
    }
}
