package projetsabonnements;

public class AbonnementGym {
    private double prix;
    private int duree; // en jours
    private String nomMembre;

    // Constructeur pour l'abonnement de base
    public AbonnementGym(String nomMembre) {
        this.nomMembre = nomMembre;
        this.duree = 30;
        this.prix = 41.25;
    }

    // Constructeur pour l'abonnement à la carte
    public AbonnementGym(String nomMembre, int nbJours) {
        this.nomMembre = nomMembre;
        this.duree = nbJours;
        this.prix = nbJours * 8.25;
    }

    // Constructeur pour l'abonnement VIP
    public AbonnementGym(String nomMembre, int nbJours, double prix) {
        this.nomMembre = nomMembre;
        this.duree = nbJours;
        this.prix = prix;
    }

    // Méthode d'accès (getter)
    public double getPrix() {
        return prix;
    }

    public int getDuree() {
        return duree;
    }

    public String getNomMembre() {
        return nomMembre;
    }

    // Méthodes de mutation (setter)
    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setNomMembre(String nomMembre) {
        this.nomMembre = nomMembre;
    }

    // Affichage de l'objet (optionnel)
    public String toString() {
        return "Abonnement de " + nomMembre + ": " + duree + " jours pour " + prix + "$";
    }
}
