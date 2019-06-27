package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor do primeiro produto");
        double prod1=ler.nextDouble();
        System.out.println("Informe o valor do segundo produto");
        double prod2=ler.nextDouble();
        System.out.println("Informe o valor do terceiro produto");
        double prod3=ler.nextDouble();

        if(((prod1 < prod2) && (prod2<prod3)) || ((prod1<prod3) && (prod3<prod2))){
            System.out.println("Orientado a comprar produto 1 menor valor: "+prod1);
        }else if(((prod2 < prod3) && (prod3<prod1)) || ((prod2<prod1) && (prod1<prod3))){
            System.out.println("Orientado a comprar produto 2 menor valor: "+prod2);
        }else if(((prod3 < prod2) && (prod2<prod1)) || ((prod3<prod1) && (prod1<prod2))){
            System.out.println("Orientado a comprar produto 3 menor valor: "+prod3);
        }else{
            System.out.println("Valor informado inválido, informe novamente para os calculos");
        }
    }



}
