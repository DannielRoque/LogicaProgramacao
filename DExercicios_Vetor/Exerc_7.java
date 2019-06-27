package DExercicios_Vetor;

import java.util.Random;

public class Exerc_7 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[]a = new int[10];
        int[]b = new int[10];
        int[]c = new int[10];

        for(int i=0; i<a.length;i++){
            a[i]=gerar.nextInt(50)+1;
            b[i]=gerar.nextInt(50)+1;
        }


        for(int i=0;i<c.length;i++){
            c[i]=(a[i]-b[i]);
            System.out.println("Valor: "+i+" = "+c[i]);
        }
    }
}
