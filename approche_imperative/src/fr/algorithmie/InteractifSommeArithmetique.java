package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

        public static void sommeA(int x){
        int tmp = x;
        for (int i = 1; i < tmp; i++){
            x = x + i;
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Veuillez entrez un nombre:");
        int nb = scanner.nextInt() ;

        sommeA(nb);
    }

}
