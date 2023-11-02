package Exercice1;



public class Point{
    private double abscisse;
    private double ordonnee;
    public Point() {
    }

    
    public Point(double abscisse, double ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }


    public double getAbscisse() {
        return abscisse;
    }
    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }
    public double getOrdonnee() {
        return ordonnee;
    }
    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }
    // fonction permettant d'initialiser
    public void initialiser(double x, double y){
        abscisse = x;
        ordonnee = y;
    }

    // fonction permettant de deplacer
    public void deplacer(double x, double y){
        abscisse += x;
        ordonnee += y;
    }

    // fonction permettant d'afficher les coordonnes d'un point

    public void afficherPointSimple(){
        System.out.println("\n\033[1m __________________________________________________________\033[0m");

        System.out.printf("\033[1m| \033[93m je suis un point de coordonnees :\033[97m \033[95m(%.2f  %.2f)   \033[97m       \n", abscisse, ordonnee);
        System.out.println("|__________________________________________________________");
        identifier();
        
    }

    public void afficher(){
        System.out.println("\n\033[1m __________________________________________________________\033[0m");

        System.out.printf("\033[1m| \033[93m je suis un point de coordonnees :\033[97m \033[95m(%.2f  %.2f)   \033[97m       \n", abscisse, ordonnee);
        System.out.println("|__________________________________________________________");
        
    }

    public void identifier(){
        // super.afficher();
        System.out.println("\033[1m\033[94m| je suis un point   |\033[0m ");
        System.out.println("\033[1m\033[96m|____________________|\033[0m");
       }

    public static void main(String[] args) {
        Point point = new Point();
        point.initialiser(2, 3);
        point.afficher();
        point.deplacer(2.3, 4.1);
        point.afficher();
    }

}