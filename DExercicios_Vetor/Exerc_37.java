package DExercicios_Vetor;

import java.util.Random;

public class Exerc_37 {
    public static void main(String[] args) {
        Random gerar  = new Random();

        int[] a = new int[15];
        int[] b = new int[15];

        for(int i=0; i<a.length; i++){
            a[i] = gerar.nextInt(5)+1;
        }

        for(int i=0; i<a.length; i++){
            for(int j=a[i]; j>0; j--){
                a[i]*=j;
                System.out.println(" Fat: "+a[i]);
            }
            System.out.println();
        }

    }
}
