package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe 1° lado do triângulo");
        double valor1 = ler.nextDouble();
        System.out.println("Informe 2° lado do triângulo");
        double valor2 = ler.nextDouble();
        System.out.println("Informe 3° lado do triângulo");
        double valor3 = ler.nextDouble();

        if (((valor1 + valor2) > valor3) || ((valor1 + valor3) > valor2) || ((valor3 + valor2) > valor1)) {
            if ((valor1 == valor2) && (valor2 == valor3)) {
                System.out.println("Triângulo Equilátero");
            } else if ((valor1 == valor2) || (valor1 == valor3) || (valor2 == valor3)) {
                System.out.println("Triângulo isósceles");
            } else if ((valor1 != valor2) || (valor1 != valor3) || (valor2 != valor3)) {
                System.out.println("Triângulo Escaleno");
            } else {
                System.out.println("Não é um triângulo");
            }
        }
    }
}
