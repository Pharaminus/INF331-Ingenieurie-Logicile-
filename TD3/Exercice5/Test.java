package Exercice5;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        Derive1 derive1 = new Derive1(random.nextInt(100), random.nextInt(100));
        Derive2 derive2 = new Derive2(random.nextInt(100), random.nextInt(100));
        
        derive1.afficher();
        derive2.afficher();
    }
}
