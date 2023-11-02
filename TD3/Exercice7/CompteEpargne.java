package Exercice7;

public class CompteEpargne extends Compte{
    private float tauxInteret;

    public CompteEpargne(String numero, String propietaire, int solde, float tauxInteret) {
        super(numero, propietaire, solde);
        this.tauxInteret = tauxInteret;
    }

    public CompteEpargne() {
        
    }

    public float getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(float tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public void augmenterSolde(){
        super.setSolde((int) (getSolde()*tauxInteret + getSolde()));
        System.out.printf("\n\n\t\t \033[1m \033[93m <[ L'augmentation s'est effectue avec succes ! votre solde est de  %d  ]>\033[0m",super.getSolde());

    }
    
}
