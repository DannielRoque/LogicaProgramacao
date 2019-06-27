package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um número inteiro");
        int num = ler.nextInt();

        if(num%2==0){
        System.out.println("Número par");
        }else{
            System.out.println("Número ímpar");
        }
    }
}
