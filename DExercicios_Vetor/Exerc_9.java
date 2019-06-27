package DExercicios_Vetor;

import java.util.Random;

public class Exerc_9 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[]a = new int[5];
        int[]b = new int[5];
        int[]c = new int[5];

        for(int i=0;i<a.length;i++){
            a[i]=gerar.nextInt(50)+1;
            b[i]=gerar.nextInt(50)+1;
            c[i]=a[i]/b[i];
            System.out.println("Valor "+i+" = "+c[i]);
        }
    }
}
