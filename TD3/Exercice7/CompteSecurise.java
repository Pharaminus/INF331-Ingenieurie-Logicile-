package Exercice7;

public class CompteSecurise extends CompteEpargne {
   
    
    public CompteSecurise(String numero, String propietaire, int solde, float tauxInteret) {
        super(numero, propietaire, solde, tauxInteret);
    }

    public CompteSecurise() {
    }

    public void retirer(int montant){
        if(super.getSolde() < montant)
            System.out.printf("\n\n\t\t  \033[1m \033[91m <[ Vous n'avez pas assez d'argent veillez recharger le compte avant ! ]>\033[0m");
        else{
            super.retirer(montant);
            System.out.printf("\n\n\t\t \033[1m \033[94m <[ Le retrait a ete effectue avec succes ! votre solde est de  %d  ]>\033[0m",super.getSolde());

        }                
    }
}
