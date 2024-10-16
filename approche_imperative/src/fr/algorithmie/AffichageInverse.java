package fr.algorithmie;

public class AffichageInverse {

    public static void Affiche(int[] tab){
        System.out.println("Affichage d'un tableau dans l'ordre");
        int i = 0;
        while (i < tab.length){
            System.out.println(tab[i]);
            i++;
        }
    }

    public static void AfficheInverse(int[] tab){

        System.out.println("Affichage d'un tableau dans l'ordre inverse");
        int i = tab.length-1;
        while (i >= 0){
            System.out.println(tab[i]);
            i--;
        }
    }

    public static int[] Copy(int[] tab){

        System.out.println("Création d'une copie d'un tableau...");

        int[] copy = new int[tab.length];

        for (int i = 0; i < tab.length; i++){
            copy[i] = tab[i];
        }

        return copy;
    }

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        Affiche(array);
        AfficheInverse(array);

        int[] arrayCopy = Copy(array);
        Affiche(arrayCopy);

    }

}
