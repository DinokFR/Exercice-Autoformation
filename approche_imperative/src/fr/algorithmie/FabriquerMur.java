package fr.algorithmie;

public class FabriquerMur {
    public static void main(String[] args) {
        // Tests de vérification
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
    }
//Mémo : Small = 1 | Big = 5 | longueur = longueur désirée 
    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {

        while (nbBig != 0 && longueur >= 5){
            longueur -= 5;
            nbBig--;
        }

        while (nbSmall != 0 && longueur > 0){
            longueur -= 1;
            nbSmall--;
        }

        return longueur == 0;
    }

    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
        if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " +
                    longueur + ") NON passant.");
        }
    }
}
