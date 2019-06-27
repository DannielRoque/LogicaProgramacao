package DExercicios_Vetor;

import java.util.Random;

public class Exerc_10 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[]a=new int[5];
        int[]b=new int[5];

        for(int i=0;i<a.length;i++){
            a[i]=gerar.nextInt(50)+1;
            b[i]=(a[i]%2);
            System.out.println("Valor "+i+" = "+b[i]);
        }
    }
}
