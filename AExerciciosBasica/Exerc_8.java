package AExerciciosBasica;

import java.util.Scanner;

public class Exerc_8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a temperatura em Farenheit");
        double f = ler.nextDouble();

        double c = (5*(f-32)/9);

        System.out.println("Temperatura em Celsius: "+c);
    }
}
