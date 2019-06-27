package AExerciciosBasica;

import java.util.Scanner;

public class Exerc_14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o peso do peixe");
        double peso = ler.nextDouble();

        if(peso>50){
            double excesso = (peso-50);
            double multa = excesso*4;
            System.out.println("Nesta pesca passou "+excesso+" kilos, valor para a multa "+multa+" Reais");
        }else{
            System.out.println("Peso inferior ao regulamento");
        }
    }
}
