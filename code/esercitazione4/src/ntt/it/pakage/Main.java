package ntt.it.pakage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il numero : ");
        n1 = input.nextInt();
        System.out.println("Inserisci l'esponente : ");
        n2 = input.nextInt();

        System.out.println("La potenza di "+n1+" elevato alla "+n2+" è : "+ potenza(n1,n2));
    }

    static public int potenza(int n1, int n2){
        int p = n1;
        for(int i = 1; i < n2; i++){
            p *= n1;
        }
        return p;
    }
}