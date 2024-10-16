package fr.algorithmie;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        int nbVoulus = (int) (Math.random()*99 +1);
        

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Veuillez essayer de deviner le nombre entre 1 et 100");
        int nb = scanner.nextInt() ;
        int nbCoups = 0;

        while (nb != nbVoulus){
            if(nb < nbVoulus){
                System.out.println("C'est plus HAUT ! Réessayez..");
            }
            else{
                System.out.println("C'est plus BAS ! Réessayez..");
            }
            nb = scanner.nextInt() ;
            nbCoups++;

        }
        System.out.println("Bravo, vous avez trouvé en " + nbCoups + " coups");

    }

}
