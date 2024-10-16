package fr.algorithmie;

public class CalculMoyenne {

    public static int moy(int[] tab){

        System.out.println("Calcul de la moyenne...");

        int x = 0;
        for (int i = 0; i < tab.length; i++) {

            x = x + tab[i];

        }

        return (x/tab.length);
    }

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
        System.out.println(moy(array));
    }

}
