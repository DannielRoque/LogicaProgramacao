package DExercicios_Vetor;

import java.util.Random;
import java.util.Scanner;

public class Exerc_5 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[]a= new int[10];
        int[]b=new int[10];

        for(int i=0;i<a.length;i++){
            a[i]=gerar.nextInt(50)+1;
        }

        for(int i=0;i<a.length;i++){
            b[i]=a[i]*i;
            System.out.println("Valor B: "+b[i]);
        }

    }
}
