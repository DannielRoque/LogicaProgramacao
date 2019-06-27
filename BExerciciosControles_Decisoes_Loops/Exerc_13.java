package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor para o dia da semana ex: 1- domingo, 2- segunda...");
        int dia = ler.nextInt();

        switch (dia){
            case 1:
                System.out.println("Domingo"); break;
            case 2:
                System.out.println("Segunda-Feira"); break;
            case 3:
                System.out.println("Terça-Feira"); break;
            case 4:
                System.out.println("Quarta-Feira"); break;
            case 5:
                System.out.println("Quinta-Feira"); break;
            case 6:
                System.out.println("Sexta-Feira"); break;
            case 7:
                System.out.println("Sábado"); break;
                default:
                    System.out.println("Sia Inválido");
        }
    }
}
