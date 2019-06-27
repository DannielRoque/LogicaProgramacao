package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_22 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valorMorango,valorMaca;
        double desc=0;
        System.out.println("Informe o quanto de morango levará 'em peso'");
        double pesoMorango = ler.nextDouble();

        System.out.println("Informe o quanto de Maça levará 'em peso'");
        double pesoMaca=ler.nextDouble();

        if(pesoMorango>0 && pesoMorango<=5){
            valorMorango=pesoMorango*2.50;
        }else {
            valorMorango=pesoMorango*2.20;
        }
        if(pesoMaca>0 && pesoMaca<=5){
            valorMaca=pesoMaca*1.80;
        }else {
            valorMaca=pesoMaca*1.50;
        }

        if((pesoMorango+pesoMaca>8)||(valorMaca+valorMorango>25.00)){
            desc=(valorMaca+valorMorango)*0.1;
        }
        System.out.println("Peso em Maça(s): "+pesoMaca+" Peso em Morango(s): "+pesoMorango);
        System.out.println("Valor em Maça(s): "+valorMaca+" Valor do Morango: "+valorMorango);
        System.out.println("Com total de R$: "+(valorMaca+valorMorango+desc));
    }
}
