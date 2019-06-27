package DExercicios_Vetor;

import java.util.Random;

public class Exerc_12 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[]a=new int[10];
        int res=0;

        for(int i=0; i<a.length;i++){
            a[i]=gerar.nextInt(50)+1;
            res+=a[i];
        }
        System.out.println("Total: "+res);
    }
}
