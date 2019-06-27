package AExerciciosBasica;

import java.util.Scanner;

public class Exerc_12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a Altura");
        double alt = ler.nextDouble();

        double peso = (72.7*alt)-58;

        System.out.println("Seu peso ideal é: "+peso);
    }
}
