package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Veuillez entrez un nombre 10 nombres");
        int max = scanner.nextInt() ;

        for (int i = 1; i < 10; i++){
            int nb = scanner.nextInt() ;
            if (max < nb ){
                max = nb;
            }
        }
        System.out.println("Le max est : " + max);



        
    }

}
