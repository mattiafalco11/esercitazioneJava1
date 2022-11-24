import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci 2 numeri interi");
        n1 = tastiera.nextInt();
        n2 = tastiera.nextInt();

        System.out.println("La somma dei due numeri e' : " + (n1+n2));
        System.out.println("la media dei due numeri e' : " + ((n1+n2)/2));
    }
}