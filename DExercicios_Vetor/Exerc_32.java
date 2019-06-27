package DExercicios_Vetor;

import java.util.Random;

public class Exerc_32 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[] a = new int[5];

        for(int i=0; i<a.length; i++){
            a[i]=gerar.nextInt(5)+1;
        }

        for(int i=0; i<a.length; i++){
            for(int j=0; j<=10; j++){
             int res =   a[i]*j;
                System.out.println(" Tabuada "+a[i]+" x "+j+" = "+res);
            }
            System.out.println("----");
        }

    }
}
