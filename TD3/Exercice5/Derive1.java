package Exercice5;

public class Derive1 extends Affichage {
    private int valEntiere;
    private float valFlotante;

    public Derive1(int valEntiere, float valFlotante) {
        this.valEntiere = valEntiere;
        this.valFlotante = valFlotante;
    }

    public Derive1() {
    }

    public int getValEntiere() {
        return valEntiere;
    }

    public void setValEntiere(int valEntiere) {
        this.valEntiere = valEntiere;
    }

    public float getValFlotante() {
        return valFlotante;
    }

    public void setValFlotante(float valFlotante) {
        this.valFlotante = valFlotante;
    }
    
    public void afficher(){
        String a = " ";
        System.out.println("-----------------------------------------");
        System.out.printf("|Je suis un entier de valeur %5d%5s |\n",valEntiere,a);
        System.out.println("|_______________________________________|________________");
        System.out.printf("|    Je suis un flottant de valeur %10f%10s |\n",valFlotante,a);
        System.out.println("|_______________________________________________________|");


    }
    
    
}
