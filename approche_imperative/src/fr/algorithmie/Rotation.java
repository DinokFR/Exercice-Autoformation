package fr.algorithmie;
import fr.algorithmie.AffichageInverse;

public class Rotation {
    
    public static void rotate(int[] tab){

        System.out.println("Rotation par la droite");
        int tmp1 = tab[0];
        int tmp2 = 0;


        for (int i = 0; i < tab.length-1; i++) {
            tmp2 = tab[i+1];
            tab[i+1] = tmp1;
            tmp1 = tmp2;
        }
        tmp2 = tab[0];
        tab[0] = tmp1;
        tmp1 = tmp2;
    }
    public static void main(String[] args) {
        int[] array1 = {0,1,2,3,4,5,6,7} ; 
        rotate(array1);
        AffichageInverse.Affiche(array1);

    }

}
