package pakage;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, m;
        n=0;
        m=1;

        Scanner tastiera = new Scanner(System.in);
        while (m<=1){
            System.out.println("Inserisci un numero in base al giorno della settimana : ");
            n = tastiera.nextInt();
            if(n<1 || n>7){
                System.out.println("Il numero deve essere compreso tra 1 e 7!!");
            }else{
                m++;
            }
        }

        switch (n){
            case 1 :
                System.out.println("Lunedì");
                break;
            case 2 :
                System.out.println("Martedì");
                break;
            case 3 :
                System.out.println("Mercoledì");
                break;
            case 4 :
                System.out.println("Giovedì");
                break;
            case 5 :
                System.out.println("Venerdì");
                break;
            case 6 :
                System.out.println("Sabato");
                break;
            case 7 :
                System.out.println("Domenica");
                break;
        }
    }
}