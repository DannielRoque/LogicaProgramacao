package AExerciciosBasica;

import java.util.Scanner;

public class Exerc_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um valor");
        int num1 = ler.nextInt();

        System.out.println("Informe mais um valor");
        int num2=ler.nextInt();

        System.out.println("Soma dos valores: "+(num1+num2));
    }
}
