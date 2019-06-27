package DExercicios_Vetor;

import java.util.Random;

public class Exerc_21 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[]a = new int[10];

        for(int i=0;i<10;i++){
            a[i]=gerar.nextInt(20)+1;
            if((a[i]%2)==0){
                continue;
            }

            System.out.println("Valor: "+a[i]);

        }
    }
}
