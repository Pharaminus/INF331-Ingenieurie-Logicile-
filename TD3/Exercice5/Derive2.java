package Exercice5;

public class Derive2 extends Affichage {
    private int entier;
    private float flottant;
    public Derive2() {
    }

    
    public Derive2(int entier, float flottant) {
        this.entier = entier;
        this.flottant = flottant;
    }


    public int getEntier() {
        return entier;
    }
    public void setEntier(int entier) {
        this.entier = entier;
    }
    public float getFlottant() {
        return flottant;
    }
    public void setFlottant(float flottant) {
        this.flottant = flottant;
    }

    public void afficher(){
        String a = " ";
        System.out.println("_________________________________________________________");
        System.out.printf("|  \033[1m  \033[96mJe suis un flottant de valeur %10f%10s \033[0m|\n",flottant,a);
        System.out.println("|_______________________________________________________|");
        // System.out.println("-----------------------------------------");
        System.out.printf("|\033[1m \033[92mJe suis un entier de valeur %5d%5s\033[0m|\n",entier,a);
        System.out.println("|_______________________________________|");

    }
}
