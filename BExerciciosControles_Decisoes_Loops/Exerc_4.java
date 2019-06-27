package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe uma letra");
        String letra = ler.next();
        letra = letra.toUpperCase();
        if (letra.length() > 1) {
            System.out.println("Letra inváloda");
        } else {
            switch (letra) {
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("Vogal: " + letra);
                    break;

                default:
                    System.out.println("Consoante informe: " + letra);
            }
        }
    }
}