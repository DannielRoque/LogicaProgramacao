package DExercicios_Vetor;

import java.util.Random;

public class Exerc_35 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[] a = new int[10];

        for(int i = 0;  i<a.length; i++){
            a[i] = gerar.nextInt(20)+1;
        }

        for(int i=0 ; i<a.length; i++){
            for(int j=1; j<=a[i]; j++){
                if(a[i]%j==0){
                    System.out.print(" Elemento: "+a[i]+ " Divisor(es): "+j);
                }
            }
            System.out.println();
        }
    }
}
