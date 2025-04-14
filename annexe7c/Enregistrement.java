package packageannexe7;

public class Enregistrement {
    private String nomUsager;
    private String motDePasse;
    private String adresseCourriel;

    public Enregistrement(String usager, String motDePasse, String adresseCourriel) {
        this.nomUsager = usager;
        this.motDePasse = motDePasse;
        this.adresseCourriel = adresseCourriel;
    }

    // trois méthodes d'accès
    public String getUsager() {
        return nomUsager;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getAdresseCourriel() {
        return adresseCourriel;
    }
}
