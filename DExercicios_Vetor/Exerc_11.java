package DExercicios_Vetor;

import java.util.Random;

public class Exerc_11 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[]a=new int[10];
        int cont=0;

        for(int i=0;i<a.length;i++){
            a[i]=gerar.nextInt(50)+1;
            if(a[i]%2==0) {
                cont++;
            }
        }
        System.out.println("Quantidade de valores pares: "+cont);

    }
}
