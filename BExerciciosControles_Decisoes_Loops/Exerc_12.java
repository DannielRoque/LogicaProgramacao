package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double fgts,sindicato,ir,qtdHoras,valorHora;
        System.out.println("Informe o valor da hora trabalhada");
        valorHora=ler.nextDouble();
        System.out.println("Informe a quantidade de hora(s) trabalhada(s)");
        qtdHoras = ler.nextDouble();

        double salario = (valorHora*qtdHoras);
        sindicato=salario*0.03;
        fgts=salario*0.11;
        if(salario>0 && salario<=900){
            ir=0;
        }else if(salario<=1500){
            ir=salario*0.5;
        }else if(salario<=2500){
            ir=salario*0.1;
        }else{
            ir=salario*0.2;
        }
        System.out.println("Salario Bruto: "+salario);
        System.out.println("IR: "+ir);
        System.out.println("Sindicato: "+sindicato);
        System.out.println("Salario Líquido: "+(salario-sindicato-ir));
    }
}
