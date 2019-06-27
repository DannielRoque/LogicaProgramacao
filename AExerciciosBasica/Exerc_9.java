package AExerciciosBasica;

import java.util.Scanner;

public class Exerc_9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius");
        double c = ler.nextDouble();

        double f = ((c*9/5)+32);

        System.out.println("Temperatura em Farenheit: "+f);
    }
}
