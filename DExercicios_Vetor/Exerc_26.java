package DExercicios_Vetor;

import java.util.Random;

public class Exerc_26 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        for(int i = 0; i<10; i++){
            a[i] = gerar.nextInt(30)+1;
            b[i] = gerar.nextInt(30)+1;

            if(a[i] > b[i]){
                c[i] = 1;
            }else if(a[i] == b[i]){
                c[i] = 0;
            }else{
                c[i] = -1;
            }
            System.out.print(" Valor Ci: "+c[i]);
        }

    }
}
