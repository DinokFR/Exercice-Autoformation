package fr.algorithmie;
import fr.algorithmie.AffichageInverse;

public class SommeDeTableauxDiff {

    //Je me suis posé la question de si je faisait juste un tableau des sommes ayant la même taille que le plus petit
    // mais au final je me suis dit que ça serais plus fun comme ça :

    public static int[] sommeDiff(int[] tab1, int[] tab2){

        System.out.println("Somme de tableaux de longueurs différentes ou égals");

        int length = 0;
        int lengthmin = 0;

        //On regarde lequel à la longueur la plus haute

        if(tab1.length <= tab2.length){
            length = tab2.length;
            lengthmin = tab1.length;
        }
        else{
            length = tab1.length;
            lengthmin = tab2.length;
        }

        int[] sum = new int[length];

        for (int i = 0; i < length; i++) {
            if (i < lengthmin){
                sum[i] = tab1[i] + tab2[i];
            }
            else if (tab1.length <= tab2.length) sum[i] = tab2[i];

            else sum[i] = tab1[i];



        }


        return sum;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 };

        AffichageInverse.Affiche(sommeDiff(array1, array2));
    }

}
