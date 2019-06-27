package AExerciciosBasica;

import java.util.Scanner;

public class Exerc_4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe os metros para converção");
        float val=ler.nextFloat();

        double res = val*100;

        System.out.println("Valor em centímetros: "+res);
    }
}
