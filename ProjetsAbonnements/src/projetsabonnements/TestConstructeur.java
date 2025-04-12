package projetsabonnements;

public class TestConstructeur {

    public static void main(String[] args) {

        // Création de 5 abonnements
        AbonnementGym ab1 = new AbonnementGym("Alice"); // abonnement de base
        AbonnementGym ab2 = new AbonnementGym("Bob", 10); // abonnement à la carte
        AbonnementGym ab3 = new AbonnementGym("Charlie", 45, 250.0); // VIP
        AbonnementGym ab4 = new AbonnementGym("Diana", 20); // à la carte
        AbonnementGym ab5 = new AbonnementGym("Eric", 60, 300.0); // VIP

        // Affichage du prix de chaque abonnement
        System.out.println("Prix abonnement Alice : " + ab1.getPrix() + "$");
        System.out.println("Prix abonnement Bob : " + ab2.getPrix() + "$");
        System.out.println("Prix abonnement Charlie : " + ab3.getPrix() + "$");
        System.out.println("Prix abonnement Diana : " + ab4.getPrix() + "$");
        System.out.println("Prix abonnement Eric : " + ab5.getPrix() + "$");

    }

}
allo