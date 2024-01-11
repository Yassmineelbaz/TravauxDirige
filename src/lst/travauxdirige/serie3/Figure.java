package lst.travauxdirige.serie3;


    abstract class Figure {
        protected String nom;

        // Constructeur de la classe Figure
        public Figure(String nom) {
            this.nom = nom;
        }

        // Méthode abstraite pour le périmètre
        public abstract double getPerimeter();

        // Méthode abstraite pour l'aire
        public abstract double getAire();

        // Méthode toString pour afficher une représentation de la figure
        @Override
        public String toString() {
            return "Figure - Nom : " + nom;
        }
    }

