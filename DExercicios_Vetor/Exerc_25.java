package DExercicios_Vetor;

import java.util.Random;

public class Exerc_25 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[] a=new int[10];
        int[] b=new int[10];

        for(int i=0; i<a.length; i++){
            a[i]=gerar.nextInt(30)+1;

            if(a[i]%2==0){
                b[i]=1;
            }else{
                b[i]=0;
            }
            System.out.println("Valor Bi : "+b[i]);
        }

    }
}
