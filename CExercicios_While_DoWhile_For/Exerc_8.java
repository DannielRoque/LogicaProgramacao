package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe valor 1");
        int val1 = ler.nextInt();
        System.out.println("Informe valor 2");
        int val2 = ler.nextInt();
        System.out.println("Informe valor 3");
        int val3 = ler.nextInt();
        System.out.println("Informe valor 4");
        int val4 = ler.nextInt();
        System.out.println("Informe valor 5");
        int val5 = ler.nextInt();

        int soma = (val1+val2+val3+val4+val5);
        double media =(soma)/5;

        System.out.println("A Soma dos valores: "+soma+" e a média: "+media);
    }
}
