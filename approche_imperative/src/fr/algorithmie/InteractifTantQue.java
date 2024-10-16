package fr.algorithmie;
import java.util.Scanner;

public class InteractifTantQue {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Veuillez entrez un nombre compris entre 1 et 10:");
        int nb = scanner.nextInt() ;
        while( nb < 1 || nb > 10){
            System.out.println("Mauvrais nombre ! Il doit être compris entre 1 et 10");
            nb = scanner.nextInt() ;
        }
        System.out.println("Votre nombre :" + nb);

        

    }
}
