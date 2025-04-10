package banque;

public class CompteBancaire {

    // Les variables de base
    private String nomProprietaire;
    private double solde;
    private String numeroCompte;

    // Variable statique partagée entre tous les objets pour compter les comptes créés
    private static int nombreComptes = 0;

    // Constructeur : initialiser un objet avec des valeurs spécifiques lors de sa création
    public CompteBancaire(String nomProprietaire, double soldeInitial) {
        this.nomProprietaire = nomProprietaire;
        this.solde = soldeInitial;  // Correction : Utiliser `soldeInitial` au lieu de `solde`

        // Incrémenter le nombre de comptes à chaque création
        nombreComptes++;

        // Numéro de compte : première lettre du nom du propriétaire, suivi d'un tiret et du nombre de comptes créés
        this.numeroCompte = nomProprietaire.substring(0, 1).toUpperCase() + "-" + nombreComptes;
    }

    // Getter pour nomProprietaire
    public String getNomProprietaire() {
        return nomProprietaire;
    }

    // Setter pour nomProprietaire (si tu veux permettre de le modifier)
    public void setNomProprietaire(String nomProprietaire) {
        this.nomProprietaire = nomProprietaire;
    }

    // Getter pour solde
    public double getSolde() {
        return solde;
    }

    // Setter pour solde (avec validation)
    public void setSolde(double solde) {
        if (solde >= 0) {
            this.solde = solde;
        } else {
            System.out.println("Le solde ne peut pas être négatif.");
        }
    }

    // Getter pour numeroCompte (pas de setter car il ne doit pas être modifié après création)
    public String getNumeroCompte() {
        return numeroCompte;
    }

    // Getter pour nombreComptes (static, pour avoir le nombre total de comptes créés)
    public static int getNombreComptes() {
        return nombreComptes;
    }

    // Méthode pour déposer de l'argent
    public void deposerArgent(double montant) {
        if (montant > 0) {
            solde += montant;  // Ajouter le montant au solde
            System.out.println("Déposé : " + montant + "$, Nouveau solde : " + solde + "$");
        } else {
            System.out.println("Le montant à déposer doit être positif.");
        }
    }

    // Méthode pour retirer de l'argent
    public void retirerArgent(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;  // Soustraire le montant du solde
            System.out.println("Retiré : " + montant + "$, Nouveau solde : " + solde + "$");
        } else {
            System.out.println("Le montant à retirer doit être positif et inférieur ou égal au solde.");
        }
    }
}
