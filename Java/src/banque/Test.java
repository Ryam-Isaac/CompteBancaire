package banque;

public class Test {
    public static void main(String[] args) {

            // Un compte crée pour Flavien Larrivée avec un solde intial de 100 $
            CompteBancaire compte1 = new CompteBancaire("Flavien Larivée", 100);

            // Un compte est crée pour Denise Lachance avec un solde inital de 36.78 $
            CompteBancaire compte2 = new CompteBancaire("Denise Lachance" ,36.78);

            // Faites afficher le numéro du compte client de M.Larrivée
            System.out.println("Numéro de compte de Flavien Larrivée : " + compte1.getNumeroCompte());

            // Un compte est crée pour Martial Maurice avec un solde intial de 40 $
            CompteBancaire compte3 = new CompteBancaire("Martial Maurice", 40 );

            // Faites afficher le numéro de compte Martial Maurice
            System.out.println("Numéro de compte de Martial Maurcie : " + compte3.getNumeroCompte());

            // Faites afficher le solde du comtpe de Mme Lachance
            System.out.println("Numero de compte de Denise Lachance" + compte2.getNumeroCompte());
    }
}
