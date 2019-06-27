package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_22 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float tot=0,med=0;
        System.out.println("Informe a quantidade de CD's na coleção");
        int qtd = ler.nextInt();

        for(int i=1;i<=qtd;i++){
            System.out.println("Informe o Valor do CD "+i);
            float valor = ler.nextFloat();
            tot+=valor;
        }
        System.out.println("O Valor médio gasto por cada CD R$: "+(tot/qtd));
    }
}
