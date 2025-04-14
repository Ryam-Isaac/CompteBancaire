package packageannexe7;

public class Controle {

    /* a.	Faites une méthode permettant de vérifier le nom d'usager de l'Enregistrement en question. Le nom d'usager doit ressembler à la forme
    : R2LabonEr où R1, R2 ou R3 représente le type d’employé, suivi du nom ( 5 lettres ) et du prénom ( 2 lettres )
    */
    public boolean verificationNomUsager (FrameExpReg.Enregistrement e){
            String regex =  "R[123][a-zA-Z]{5}[a-zA-Z]{2}";
            return e.getUsager().matches(regex);
    }


    /*b.	Faites une méthode permettant de vérifier le courriel de l'objet Enregistrement, soit qu'il aie un arobas ( @ ) à l'intérieur
    *
    * */

    public boolean verifierAdresseCourriel(FrameExpReg.Enregistrement e) {
        return e.getAdresseCourriel().contains("@");
    }


    /*c.	Faites une méthode permettant de vérifier le mot de passe de l'objet Enregistrement;
    *    le mot de passe doit avoir 8 caractères ou plus, comprenant au moins un chiffre et au moins une lettre majuscule.
    * */

    public boolean verifierMotDePasse(FrameExpReg.Enregistrement e) {
        String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
        return e.getMotDePasse().matches(regex);
    }
}

