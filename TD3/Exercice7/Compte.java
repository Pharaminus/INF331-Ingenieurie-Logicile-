package Exercice7;

public class Compte {
    private String numero;
    private String propietaire;
    private int solde;
    public Compte(String numero, String propietaire, int solde) {
        this.numero = numero;
        this.propietaire = propietaire;
        this.solde = solde;
    }
    public Compte() {
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getPropietaire() {
        return propietaire;
    }
    public void setPropietaire(String propietaire) {
        this.propietaire = propietaire;
    }
    public int getSolde() {
        return solde;
    }
    public void setSolde(int solde) {
        this.solde = solde;
    }

    // fonction pour effectuer le depots dans sont compte
    public void deposer(int montant){
        solde += montant;
    }

    // fonction pour effectuer le retrait dans son compte
    public void retirer(int montant){
        solde -= montant;
        System.out.printf("\n\n\t\t \033[1m \033[94m <[ Le retrait a ete effectue avec succes ! votre solde est de  %d  ]>\033[0m",solde);

    }


}
