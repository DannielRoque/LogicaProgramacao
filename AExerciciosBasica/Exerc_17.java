package AExerciciosBasica;

import java.util.Scanner;

public class Exerc_17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo em MB");
        double arquivo=ler.nextDouble();

        System.out.println("Informe a velocidade da internet em Mbps");
        double internet=ler.nextDouble();

        double tempo = arquivo/internet;

        System.out.printf("Tempo de download: "+tempo);
    }
}
