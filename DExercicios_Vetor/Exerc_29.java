package DExercicios_Vetor;

import java.util.Random;

public class Exerc_29 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];

        for(int i=0; i<a.length;i++){
            a[i] = gerar.nextInt(20)+1;
            b[i] = gerar.nextInt(20)+1;
            System.out.print(" A: "+a[i]);
            System.out.print(" B: "+b[i]);
        }

        for(int i=0 ; i<a.length; i++){
            c[i]=a[i];
        }
        int j=0;
        for(int i=a.length ; i<c.length; i++){
            c[i]=b[j];
            j++;
        }
        for(int i=0 ; i<c.length ; i++){
            System.out.print(" C:"+c[i]);
        }

    }
}
