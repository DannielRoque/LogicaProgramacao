package DExercicios_Vetor;

import java.util.Scanner;

public class Exerc_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[]a=new int[15];
        int[]b=new int[15];

        System.out.println("Informe os elementos do vetor");
        for(int i=0;i<a.length;i++){
            a[i]=ler.nextInt();
        }
        for(int i=0;i<a.length;i++){
            b[i]= (a[i]*a[i]);
        }

        for(int i=0; i<a.length;i++){
            System.out.println("Valores vetor A: "+a[i]);
        }
        for(int i=0;i<b.length;i++){
            System.out.println("Valores vetor B: "+b[i]);
        }
    }
}
