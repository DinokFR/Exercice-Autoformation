package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

    public static void suivant(int x){
        for (int i = 1; i <= 10; i++){
            System.out.println(x+i);
        }
    }

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in) ;
        System.out.println("Veuillez entrez un nombre:");
        int nb = scanner.nextInt() ;

        suivant(nb);
    }

}
