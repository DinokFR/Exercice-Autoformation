package fr.algorithmie;
import fr.algorithmie.AffichageInverse;
public class InversionContenu {

    public static int[] CopyInverse(int[] tab){

        System.out.println("Création d'une copie inverse tableau...");

        int[] copy = new int[tab.length];
        int x = tab.length-1;

        for (int i = 0; i < tab.length && x >= 0; i++){
            copy[i] = tab[x];
            x--;
        }

        return copy;
    }



    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] arrayCopy = CopyInverse(array);
        System.out.println("Affichage de la copie");
        AffichageInverse.Affiche(arrayCopy);
        System.out.println("Affichage de l'original");
        AffichageInverse.Affiche(array);

    }

}
