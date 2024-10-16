package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

    public static int fibonacci(int Rank){ //Le faire de façon récursive était plus simple
        if (Rank == 0){
            return 0;
        }
        else if (Rank == 1){
            return 1;
        }
        else{
            return fibonacci(Rank-1) + fibonacci(Rank-2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Veuillez rentrer le rang que vous voulez calculer :");
        int rank = scanner.nextInt() ;
        System.out.println(fibonacci(rank));
    }
}
