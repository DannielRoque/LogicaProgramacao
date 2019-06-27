package AExerciciosBasica;

import java.util.Scanner;

public class Exerc_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o comprimento do quadrado em metros");
        double cm = ler.nextDouble();

        System.out.println("Informe a largura do quadrado em metros");
        double lg = ler.nextDouble();

        System.out.println("Area do quadrado: "+(cm*lg)+" Metros");
    }
}
