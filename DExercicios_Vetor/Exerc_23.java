package DExercicios_Vetor;

import java.util.Random;

public class Exerc_23 {
    public static void main(String[] args) {
        Random gerar = new Random();
        int[] vet=new int[10];
        int flag=1,i=0;

        while(flag!=0){
            vet[i]= gerar.nextInt(10)+1;
            flag=(vet[i]%2);
            System.out.println("Valor "+vet[i]);
            i++;
        }

    }
}
