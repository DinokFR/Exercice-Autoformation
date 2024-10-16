package fr.algorithmie;

public class AffichageSuite {

    public static void SuiteFor(){
        System.out.println("Nombres de 1 à 10 :");
        for(int i = 1; i<=10; i++){
            System.out.println(i);
        }
    }

    public static void PaireFor(){
        System.out.println("Nombres pairs entre 0 et 10 :");
        for(int i = 1; i<=10; i++){ //possible aussi en incrémentant de 2 à chaque fois, mais j'avais envie de m'amuser
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void ImpaireFor(){
        System.out.println("Nombres impairs entre 0 et 9 :");
        for(int i = 1; i<=10; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }



     // Fonction pour afficher tous les nombres de 1 à 10 inclus
     public static void SuiteWhile() {
        int i = 1;
        System.out.println("Nombres de 1 à 10 :");
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    // Fonction pour afficher tous les nombres pairs entre 0 et 10 inclus
    public static void PaireWhile() {
        int i = 0;
        System.out.println("Nombres pairs entre 0 et 10 :");
        while (i <= 10) {
            System.out.println(i);
            i += 2;
        }
    }

    // Fonction pour afficher tous les nombres impairs entre 0 et 9 inclus
    public static void ImpaireWhile() {
        int i = 1;
        System.out.println("Nombres impairs entre 0 et 9 :");
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
    }


    public static void main(String[] args) {
        SuiteFor();

        PaireFor();

        ImpaireFor();

        SuiteWhile();

        PaireWhile();

        ImpaireWhile();
    }
}
