public class Main {
    public static void main(String[] args) {
        int[] array = {45,34,24,78,65,43,21,67,89,11};
        int temp;

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