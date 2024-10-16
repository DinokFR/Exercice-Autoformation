package fr.algorithmie;
import fr.algorithmie.AffichageInverse;

public class SommeDeTableaux {

    public static int[] somme(int[] tab1, int[] tab2){
        if(tab1.length != tab2.length){
            System.out.println("Les deux tableaux ne sont pas de la même longueurs !");
            return null;
        }

        int[] sum = new int[tab1.length];

        for (int i = 0; i < tab1.length; i++) {

            sum[i] = tab1[i] + tab2[i];

        }


        return sum;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

        AffichageInverse.Affiche(somme(array1,array2));

    }

}
