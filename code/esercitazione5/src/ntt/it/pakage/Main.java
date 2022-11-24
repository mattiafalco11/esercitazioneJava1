package ntt.it.pakage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner scn = new Scanner(System.in);

        System.out.println("Inserisci un numero : ");
        n = scn.nextInt();

        System.out.println(func(n));

    }
    static public int func(int n){
        if(n%2 == 0){
            return 1+(n/2);
        }else{
            return 0;
        }
    }
}