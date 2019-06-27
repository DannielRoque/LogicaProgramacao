package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int pais1,pais2,porc1,porc2,cont=0;

        System.out.println("Informe a quantidade de habitantes do 1º Pais");
        pais1 =ler.nextInt();
        System.out.println("Qual a porcentagem anual ex: '1' '2,3'...");
        porc1=ler.nextInt();

        System.out.println("Informe a quantidade de habitantes do 2º Pais");
        pais2=ler.nextInt();
        System.out.println("Qual a porcentagem anual ex: '1' '2,3'...");
        porc2=ler.nextInt();

        while(pais1<pais2){
            pais1+=(porc1*pais1)/100;
            pais2+=(porc2*pais2)/100;
            cont++;
        }
        System.out.println("Em "+cont+" anos o país 1 será igual ou maior que país 2");
    }
}
