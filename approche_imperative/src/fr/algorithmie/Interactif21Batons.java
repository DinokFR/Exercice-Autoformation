package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {

    //On peut prendre 1, 2, 3 bâtons par tours, il y en à 21 en tout, le dernier à prendre un bâton perd
    public static int nbBaton = 21;

    public static void main(String[] args) {

        String joueur1 = "joueur";
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Il y as 21 bâtons ! Chaque tours, le joueur prend de 1 à 3 bâtons. Le dernier à retirer un bâton perd, le jeu s'arrête quand il n'y as plus de bâton !");


        if (Math.random() < 0.5){  //Ici on décide qui commence à l'aide de Math.random
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
            System.out.println("Combien de bâtons voulez-vous prendre ? (1,2 ou 3)"); //On demande combien de baton veux prendre le joueur
            nbEnlevé = scanner.nextInt() ;

            while (nbEnlevé < 1 || 3 < nbEnlevé){ //On check si la valeurs entrée est comprise entre 1 et 3
                System.out.println("Mauvaise valeurs ! (1, 2, 3) Réessayez :");
                nbEnlevé = scanner.nextInt() ;
            }

            if ( nbEnlevé > nbBaton ){ //Si il y as trop de bâtons enlevé par rapport au nombre de bâton, on le réduit
                nbEnlevé = nbBaton;
            }


            nbBaton = nbBaton - nbEnlevé;

            if (nbBaton == 0){ //Si il n'y as plus de bâton à ce stade, le joueur à perdu
                System.out.println("Vous avez perdu !");
                break;
             }

            System.out.println("Il reste " + nbBaton + " batons !");

            if (nbBaton > 17 && nbBaton - 17 < 3){  //Ici on fait en sorte que l'ordinateur, gagne si il le peut 
                nbEnlevé = nbBaton - 17;
            }
            else if (nbBaton > 13 && nbBaton - 13 < 3){
                nbEnlevé = nbBaton - 13;
            }
            else if (nbBaton > 9 && nbBaton - 9 < 3){
                nbEnlevé = nbBaton - 9;
            }
            else if (nbBaton > 5 && nbBaton - 5 < 3){
                nbEnlevé = nbBaton - 5;
            }
            else if (nbBaton > 1 && nbBaton - 1 < 3){
                nbEnlevé = nbBaton - 1;
            }
            else nbEnlevé = (int) (Math.random() * 3) + 1;

            if ( nbEnlevé > nbBaton ){ //Si il y as trop de bâtons enlevé par rapport au nombre de bâton, on le réduit
                nbEnlevé = nbBaton;
            }

            nbBaton = nbBaton - nbEnlevé; 
            if (nbBaton == 0){  //Si il n'y as plus de bâton à ce stade, l'ordinateur à perdu
               System.out.println("L'ordinateur à perdu !");
            }
            else  System.out.println("L'ordinateur à retiré " + nbEnlevé + " Bâtons !");
            

        }



    }


}
