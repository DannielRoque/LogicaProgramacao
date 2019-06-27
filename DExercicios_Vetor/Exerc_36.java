package DExercicios_Vetor;

import java.util.Random;

public class Exerc_36 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[] a = new int[11];

        for( int i=0; i<a.length; i++){
            a[i] = gerar.nextInt(19)+1;
        }

        for(int i=0; i<a.length; i++){
            for(int j=1; j<=2; j++){
                a[i]*=a[i];
                System.out.print(" "+a[i]);
            }
            System.out.println();
        }
    }
}
