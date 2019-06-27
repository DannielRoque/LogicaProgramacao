package DExercicios_Vetor;

import java.util.Random;

public class Exerc_30 {
    public static void main(String[] args) {
        Random gerar = new Random();
        int[] a = new int[20];
        int[] b = new int[20];
        int[] c = new int[20];

        for(int i = 0; i < a.length; i++){
            a[i] = gerar.nextInt(35)+1;
        }
        int j=0;
        for(int i = 0 ; i<a.length;i++){
            if(a[i]%2==0){
                b[i]=a[i];
                System.out.print(" Par ->"+b[i]);
            }else{
                c[i]=a[i];
                System.out.print(" Impar ->"+c[i]);
            }
        }
        System.out.println();





    }
}
