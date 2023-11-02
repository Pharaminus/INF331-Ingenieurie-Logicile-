package Exercice7;

public class Test {
    public static void main(String[] args) {
        CompteSecurise compteSecurise = new CompteSecurise("12BLL237", "Balekamen B Landry", 1000000, (float) 0.5);
        compteSecurise.retirer(800000);
        compteSecurise.retirer(250000);
        
        Compte compte = new Compte("12BLL237", "Balekamen B Landry", 50000);
        compte.retirer(60000);
        compteSecurise.augmenterSolde();
    }
}
