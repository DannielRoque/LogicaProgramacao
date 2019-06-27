package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int res=1;
        System.out.println("Informe o valor de base");
        int valBase = ler.nextInt();

        System.out.println("Informe o valor do expoente");
        int valExpoente = ler.nextInt();

        for(int i=valExpoente; i>0; i--){
             res *= valBase;
        }
        System.out.println("Resultado: "+res);
    }
}
