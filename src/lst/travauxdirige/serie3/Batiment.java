package lst.travauxdirige.serie3;

class Batiment {
    private String adresse;

    // Constructeurs de la classe Batiment
    public Batiment() {
        this.adresse = "Inconnue";
    }

    public Batiment(String adresse) {
        this.adresse = adresse;
    }

    // Accesseurs et mutateurs pour l'attribut adresse
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Méthode toString pour afficher une représentation du Batiment
    @Override
    public String toString() {
        return "Bâtiment - Adresse : " + adresse;
    }
}

