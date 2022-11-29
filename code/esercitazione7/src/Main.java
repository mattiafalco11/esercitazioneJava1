import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int temp;

        Scanner scn = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            try{
                System.out.println("Inserisci il "+(i+1)+" numero : ");
                array[i] = scn.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Error : " + e);
                System.out.println("Puoi inserire solo un valore intero!!");
            }catch (Exception e){
                System.out.println("Error : " + e);
            }
        }

        for(int i = 0; i < (array.length - 1); i++){
            for(int j = 1; j<(array.length - i); j++){
                if(array[j - 1]>array[j]){
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i<10; i++){
            System.out.print(array[i]+", ");
        }
    }
}