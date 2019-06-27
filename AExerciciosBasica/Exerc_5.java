package AExerciciosBasica;

import java.util.Scanner;

public class Exerc_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o raio de um circulo desejado em centímetros");
        float raio = ler.nextFloat();

        double area= raio*raio;
        System.out.println("Area do circulo: "+area);
    }
}
