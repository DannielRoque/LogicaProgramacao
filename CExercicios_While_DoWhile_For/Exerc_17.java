package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int fat=1;
        System.out.println("Informe um numero para fatorar");
        int num = ler.nextInt();

        for(int i=num;i>1;i--){
            fat*=i;
            System.out.println(fat);
        }
        System.out.println("Valor Fatorado = "+fat);
    }
}
