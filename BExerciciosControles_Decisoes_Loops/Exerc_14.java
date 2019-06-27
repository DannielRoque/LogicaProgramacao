package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a primeira nota parcial");
        double nota1=ler.nextDouble();
        System.out.println("Informe a segunda nota parcial");
        double nota2=ler.nextDouble();

        double med=(nota1+nota2)/2;

        if(med >= 9 && med<=10){
            System.out.println("Aprovado Nota A:"+med);
        }else if(med>=7.5){
            System.out.println("Aprovado Nota B: "+med);
        }else if(med>=6){
            System.out.println("Aprovado Nota C: "+med);
        }else if(med>=4){
            System.out.println("Reprovado Nota D: "+med);
        }else if(med>=0){
            System.out.println("Reprovado Nota E: "+med);
        }else{
            System.out.println("Nota Inválida ! ");
        }
    }
}
