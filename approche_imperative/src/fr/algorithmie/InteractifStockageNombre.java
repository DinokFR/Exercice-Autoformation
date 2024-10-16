package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

    public static int[] array = new int[0];

    public static int[] Copy(int[] tab){

        int[] copy = new int[tab.length+1];

        for (int i = 0; i < tab.length; i++){
            copy[i] = tab[i];
        }

        return copy;
    }

    public static void Ajout(int x){
        array = Copy(array);
        array[array.length-1] = x;
  

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Bienvenue ! Tapez \"Ajout\" pour ajouter un nombre ou \"Affiche\" pour afficher les nombres stockés enfin faite \"Quitter\" pour arrêter le programme.");
        String action = scanner.nextLine() ;

        while(!action.equals("Quitter")){
            if (action.equals("Ajout")){
                System.out.println("Veuillez entrer la valeur à ajouter :");
                int nb = scanner.nextInt();
                Ajout(nb);
                System.out.println("Variable Ajouté !");
                System.out.println("Veuillez rentrer une autre commande");
            }
            else if (action.equals("Affiche")){
                System.out.println("Voici les valeurs stockées :");
                AffichageInverse.Affiche(array);
                System.out.println("Veuillez rentrer une autre commande");

            }
            
            action = scanner.nextLine() ;


        }

    }

}
