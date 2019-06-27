package AExerciciosBasica;

import java.util.Scanner;

public class Exerc_11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe 1° numero inteiro");
        int num1 = ler.nextInt();

        System.out.println("Informe 2° numero inteiro");
        int num2 = ler.nextInt();

        System.out.println("Informe um numero real");
        double num3 = ler.nextDouble();

        double a = ((2*num1)+(num2/2));
        double b = ((3*num1)+num3);
        double c = (num3*num3*num3);

        System.out.println("O produto do dobro do primeiro com metade so segundo: "+a);
        System.out.println("Soma do triplo do primeiro com terceiro: "+b);
        System.out.println("Terceiro elevado ao cubo: "+c);
    }
}
