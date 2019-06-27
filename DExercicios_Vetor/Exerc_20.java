package DExercicios_Vetor;

import java.util.Scanner;

public class Exerc_20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[]a = new int[10];
        int perc0=0, perc1=0;


        for(int i=0;i<10;i++){
            a[i] = (int)Math.round(Math.random()*1);
        }

        for(int i=0;i<10;i++){
            if(a[i]==0){
                perc0++;
            }else if(a[i]==1){
                perc1++;
            }
        }
        perc0 = ( perc0/10)*100;
        perc1 = ( perc1/10)*100;

        System.out.println("Percentual de 0's : "+perc0+" Percentual de 1's"+ perc1);
    }
}
