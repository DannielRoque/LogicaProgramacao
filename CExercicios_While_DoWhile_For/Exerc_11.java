package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int soma=0;
        System.out.println("Informe o 1º valor");
        int val1=ler.nextInt();

        System.out.println("Informe o 2º valor");
        int val2=ler.nextInt();

        for(int i=val1+1;i<val2;i++){
             soma += i;
            System.out.println(soma);
        }
        System.out.println("Soma do intervalo: "+soma);
    }
}
