package ntt.it.pakage;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        int pow1, pow2;

        pow1 = 2;
        while(i<16){
            pow1 *= 2;
            i++;
        }
        System.out.println("Potenza di 2 con il while : "+pow1);

        pow2 = 2;
        for(int j=1; j<16; j++){
            pow2 = pow2 * 2;
        }
        System.out.println("Potenza di 2 con il for : "+pow2);

        System.out.println("Potenza di 2 con il math.pow : "+ Math.pow(2, 16));
    }
}