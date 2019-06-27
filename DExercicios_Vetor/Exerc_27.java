package DExercicios_Vetor;

import java.util.Random;

public class Exerc_27 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[] a = new int[10];
        int[] b = new int[10];

        for(int i=0; i<a.length; i++){
            a[i]=gerar.nextInt(15)+1;

            if(a[i]<7) {
                b[i] = 'a';
            }else if(a[i] == 7){
                b[i] = (char) 'b';
            }else if(a[i]>7 && a[i]<10){
                 b[i]= (char) (char) 'c';
            }else if(a[i] == 10){
                b[i] = (char) 'd';
            }else{
                b[i] = (char)'e';
            }
            System.out.print(" "+ (char) b[i]);
        }
    }
}
