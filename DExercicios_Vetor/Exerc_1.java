package DExercicios_Vetor;

import java.util.Scanner;

public class Exerc_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];

        System.out.println("Informe os elementos do vetor");
        for(int i=0;i<a.length;i++){
            a[i]=ler.nextInt();
        }
        System.out.println("Vetor 'a' e vetor 'b' ");
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }

        for(int i=0;i<a.length;i++){
            System.out.println(" Vetor A: "+a[i]);
        }
        for(int i=0;i<b.length;i++){
            System.out.println(" Vetor B: "+b[i]);
        }

    }
}
