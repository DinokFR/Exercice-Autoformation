package fr.algorithmie;

public class RechercheMax {

    public static int max(int[] tab){

        System.out.println("Recherche du Max...");

        int x = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > x) {
                x = tab[i];
            }
        }

        return x;
    }

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
        System.out.println(max(array));
    }

}
