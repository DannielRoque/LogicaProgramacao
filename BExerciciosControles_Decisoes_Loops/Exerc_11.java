package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe seu sálario");
        double sal = ler.nextDouble();
        double aum;
        if(sal>0 && sal<=280){
            aum=sal*0.2;
        }else if(sal<=700){
            aum= sal*0.15;
        }else if(sal<=1500){
            aum=sal*0.1;
        }else{
            aum=sal*0.05;
        }
        System.out.println("Salario: "+sal+" Aumento: "+aum+" Novo Salario: "+(sal+aum)+" Reais");
    }
}
