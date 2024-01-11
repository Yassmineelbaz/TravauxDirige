package lst.travauxdirige.serie3;

class TravailleurHoraire extends Employe {
    private double retribution;
    private double heures;

    public TravailleurHoraire() {
        super();
        this.retribution = 0.0;
        this.heures = 0.0;
    }

    public TravailleurHoraire(String nom, String prenom, double retribution) {
        super(nom, prenom);
        this.retribution = retribution;
        this.heures = 0.0;
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

    @Override
    public double gains() {
        return retribution * heures;
    }

    @Override
    public String toString() {
        return super.toString() + ", Rémunération horaire : " + retribution + ", Heures : " + heures;
    }
}

