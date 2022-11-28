package ntt.it.pakage;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int[] array = new int[10];

        Scanner scn = new Scanner(System.in);

        for (int i=0; i < 10; i++){
            System.out.println("Inserisci un numero : ");
            n = scn.nextInt();

            array[i] = n;
        }
        Arrays.sort(array);
        for(int i = 0;i<10;i++) {
            System.out.println(array[i]);
        }
    }
}