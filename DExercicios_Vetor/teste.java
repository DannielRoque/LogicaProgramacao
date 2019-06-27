package DExercicios_Vetor;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int val, fat=1;

        System.out.println("Informe o valor");
        val=ler.nextInt();

        for (int i=val; i>0; i--){
            fat*=i;
            System.out.println(" Fatorial: "+fat);
        }
    }
}
