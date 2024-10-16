package fr.algorithmie;

public class FirstLast {

    public static void main(String[] args) {
        int[] array1 = {6, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 6} ; 
        boolean x = (array1.length >= 1 && array1[0] == array1[array1.length-1]);

        System.out.println(x);
    }

}
