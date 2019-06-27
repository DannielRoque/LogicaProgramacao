package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro valor");
        int v1 = ler.nextInt();
        System.out.println("Informe o segundo valor");
        int v2 = ler.nextInt();
        System.out.println("Informe o terceiro valor");
        int v3 = ler.nextInt();

        if (v1 > v2 && v2 > v3) {
            System.out.println("Maior valor = " + v1 + " Menor valor = " + v3);
        } else if (v1 > v3 && v3 > v2) {
            System.out.println("Maior valor = " + v1 + " Menor valor = " + v2);
        } else if (v2 > v1 && v1 > v3) {
            System.out.println("Maior valor = " + v2 + " Meno valor = " + v3);
        } else if (v2 > v3 && v3 > v1) {
            System.out.println("Maior valor = " + v2 + " Menor valor = " + v1);
        } else if (v3 > v1 && v1 > v2) {
            System.out.println("Maior valor = " + v3 + " Menor valor = " + v2);
        } else if (v3 > v2 && v2 > v1) {
            System.out.println("Maior valor = " + v3 + " Menor valor = " + v1);
        } else {
            System.out.println("Consulta de valores inválida");
        }
    }
}
