package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {

    //On peut prendre 1, 2, 3 bâtons par tours, il y en à 21 en tout, le dernier à prendre un bâton perd
    public static int nbBaton = 21;

    public static void main(String[] args) {
        String joueur1 = "joueur";
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Il y as 21 bâtons ! Chaque tours, le joueur prend de 1 à 3 bâtons. Le dernier à retirer un bâton perd, le jeu s'arrête quand il n'y as plus de bâton !");
        if (Math.random() < 0.5){
            joueur1 = "Ordi";
            System.out.println("L'ordinateur commence !");
        }
        else System.out.println("Tu commence ! (T'as perdu)");

        if (joueur1.equals("Ordi")){
            int random = (int) (Math.random() * 3) + 1; // l'ordi retire un nombre de bâtons random
            nbBaton = nbBaton - random;
            System.out.println("L'ordinateur à retiré " + random + " Bâtons !");
        }
        int nbEnlevé = 0;

        while (nbBaton != 0) {
            System.out.println("Il reste " + nbBaton + " batons !");
            System.out.println("Combien de bâtons voulez-vous prendre ? (1,2 ou 3)");
            nbEnlevé = scanner.nextInt() ;

            while (1 < nbEnlevé && nbEnlevé < 3){
                System.out.println("Mauvaise valeurs ! (1, 2, 3) Réessayez :");
                nbEnlevé = scanner.nextInt() ;
            }

            if ( nbEnlevé > nbBaton ){
                nbEnlevé = nbBaton;
            }


            nbBaton = nbBaton - nbEnlevé;
            System.out.println("Il reste " + nbBaton + " batons !");

            if (nbBaton > 17 && nbBaton - 17 > 3){
                nbEnlevé = nbBaton - 17;
            }
            else if (nbBaton > 13 && nbBaton - 13 > 3){
                nbEnlevé = nbBaton - 13;
            }
            else if (nbBaton > 9 && nbBaton - 9 > 3){
                nbEnlevé = nbBaton - 9;
            }
            else if (nbBaton > 5 && nbBaton - 5 > 3){
                nbEnlevé = nbBaton - 5;
            }
            else if (nbBaton > 1 && nbBaton - 1 > 3){
                nbEnlevé = nbBaton - 1;
            }
            else nbEnlevé = (int) (Math.random() * 3) + 1;

            if ( nbEnlevé > nbBaton ){
                nbEnlevé = nbBaton;
            }

            nbBaton = nbBaton - nbEnlevé;
            System.out.println("L'ordinateur à retiré " + nbEnlevé + " Bâtons !");

        }



    }


}
