package fr.algorithmie;

public class AffichagePartiel {

    public static void AffichePlus3(int[] tab){

        System.out.println("Affichage des entiers supérieurs à 3");
        for (int i = 0; i < tab.length; i++){ //En soit on peut mettre la condition dans le for, mais je suppose que c'est ça que vous vouliez
            if(tab[i] > 3){
                System.out.println(tab[i]);
            }
        }
    }

    public static void AffichePairs(int[] tab){
        System.out.println("Affichage des nombres pairs");
        for (int i = 0; i < tab.length; i++){
            if(tab[i]%2 == 0){
                System.out.println(tab[i]);
            }
        }

    }

    public static void AfficheIndexPairs(int[] array) {
        System.out.println("Valeurs aux index pairs :");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void AfficheEntiersImpairs(int[] array) {
        System.out.println("Entiers impairs :");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        AffichePlus3(array);
        AffichePairs(array);
        AfficheIndexPairs(array);
        AfficheEntiersImpairs(array);
    }

}
