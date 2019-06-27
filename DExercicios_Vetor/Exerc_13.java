package DExercicios_Vetor;

import java.util.Random;

public class Exerc_13 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[]a=new int[10];
        int resp=0;

        for(int i=0;i<a.length;i++){
            a[i]=gerar.nextInt();
            resp = a[i]%5;
            System.out.println(resp);
        }

    }
}
