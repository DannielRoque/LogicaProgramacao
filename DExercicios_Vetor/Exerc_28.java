package DExercicios_Vetor;

import java.util.Random;

public class Exerc_28 {
    public static void main(String[] args) {
        Random gerar = new Random();
        int[] a = new int[10];
        int[] b = new int[10];
        int j =0;

        for(int i=0; i<a.length; i++){
            a[i]=gerar.nextInt(30)+1;
            System.out.print(" "+a[i]);
        }
        System.out.println();

        for(int i = a.length-1; i>=0; i--){
            b[j]= a[i];
            System.out.print(" "+b[j]);
            j++;
        }

    }
}
