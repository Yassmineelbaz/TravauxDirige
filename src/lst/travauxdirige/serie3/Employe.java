package lst.travauxdirige.serie3;

abstract class Employe {
    protected String nom;
    protected String prenom;

    // Constructeurs de la classe Employe
    public Employe() {
        this.nom = "Inconnu";
        this.prenom = "Inconnu";
    }

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Accesseurs et mutateurs pour les attributs de Employe
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Méthode toString pour afficher une représentation de l'employé
    @Override
    public String toString() {
        return "Employé - Nom : " + nom + ", Prénom : " + prenom;
    }

    // Méthode abstraite pour le salaire
    public abstract double gains();
}

class Patron extends Employe {
    private double salaire;

    // Constructeurs de la classe Patron
    public Patron() {
        super();
        this.salaire = 0.0;
    }

    public Patron(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    // Accesseurs et mutateurs pour les attributs de Patron
    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    // Implémentation de la méthode gains pour le salaire du patron
    @Override
    public double gains() {
        return salaire;
    }

    // Méthode toString pour afficher une représentation du patron
    @Override
    public String toString() {
        return super.toString() + ", Salaire : " + salaire;
    }
}

class TravailleurCommission extends Employe {
    private double salaire;
    private double commission;
    private int quantite;

    // Constructeurs de la classe TravailleurCommission
    public TravailleurCommission() {
        super();
        this.salaire = 0.0;
        this.commission = 0.0;
        this.quantite = 0;
    }

    public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;
        this.quantite = 0;
    }

    // Accesseurs et mutateurs pour les attributs de TravailleurCommission
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
    @Override
    public double gains() {
        return salaire + commission * quantite;
    }

    // Méthode toString pour afficher une représentation du travailleur à la commission
    @Override
    public String toString() {
        return super.toString() + ", Salaire : " + salaire + ", Commission : " + commission + ", Quantité : " + quantite;
    }
}

