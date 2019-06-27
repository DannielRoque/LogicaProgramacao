package AExerciciosBasica;

import java.util.Scanner;

public class Exerc_7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a quantidade de horas trabalhadas no mês");
        double hmes = ler.nextInt();

        System.out.println("Informe quanto ganha por hora");
        double vhora = ler.nextDouble();

        System.out.println("Total do seu salário no més é: "+(vhora*hmes)+" reais");
    }
}
