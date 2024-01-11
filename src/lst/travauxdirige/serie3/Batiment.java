package lst.travauxdirige.serie3;

class Batiment {
    private String adresse;

    
    public Batiment() {
        this.adresse = "Inconnue";
    }

    public Batiment(String adresse) {
        this.adresse = adresse;
    }

   
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    
    @Override
    public String toString() {
        return "Bâtiment - Adresse : " + adresse;
    }
}

