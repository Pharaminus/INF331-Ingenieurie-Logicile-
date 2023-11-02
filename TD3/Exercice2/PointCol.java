package Exercice2;

import java.util.Random;

import Exercice1.Point;

public class PointCol extends Point {
    private byte couleur;

    
    
   

    public PointCol() {
    }

   

public PointCol(double abscisse, double ordonnee, byte couleur) {
        super(abscisse, ordonnee);
        this.couleur = couleur;
    }



public void afficher(){
    super.afficher();
    System.out.println("\n\033[1m __________________________________________________________\033[0m");

    System.out.printf("\033[1m| \033[93m je suis un point de coordonnees :\033[97m \033[95m(%.2f  %.2f)   \033[97m       \n", super.getAbscisse(), super.getOrdonnee());
    System.out.println("|__________________________________________________________");
    identifier();
   }

public void afficherPointColore(){
   
    System.out.println("\n\033[1m __________________________________________________________\033[0m");
    System.out.printf("\033[1m| \033[93m je suis un point de coordonnees :\033[97m \033[95m(%.2f  %.2f)   \033[97m       \n", super.getAbscisse(), super.getOrdonnee());
    System.out.println("|__________________________________________________________");
    // identifier();
   }

   public void identifier(){
    // super.afficher();
    System.out.println("\033[1m\033[94m| Je suis un point colore de couleur : "+ couleur+"   |\033[0m ");
    System.out.println("\033[1m\033[96m|__________________________________________|\033[0m");
   }

   public static void main(String[] args) {
    // PointCol pointCol = new PointCol(2.3, 4.9, (byte) 10);
    // pointCol.afficher();
    // pointCol.deplacer(3, 5);
    // pointCol.afficher();
    Random random = new Random();

    int nombrePoint = random.nextInt(10);
    Point[] tableauHeterogene = new Point[nombrePoint];
    
    for(int i = 0; i < nombrePoint; i++){
        int val = random.nextInt(100);

        if(val % 2 == 0){
            Point pointCol2 = new PointCol(random.nextInt(100), random.nextInt(100), (byte) (random.nextInt(100)));
            tableauHeterogene[i] = pointCol2;
        }
        else{
            Point pointCol2 = new Point(random.nextInt(100), random.nextInt(100));
            tableauHeterogene[i] = pointCol2;
        }
            
    }

    for(int i = 0; i < tableauHeterogene.length; i++){
       tableauHeterogene[i].afficher();
    }

   }

    
}
