package AExerciciosBasica;

import java.util.Scanner;

public class Exerc_15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe as horas trabalhadas no mês");
        int hmes = ler.nextInt();

        System.out.println("Informe o valor ganho por hora");
        int htrab = ler.nextInt();

        double salBruto = (hmes*htrab);
        double ir = salBruto*0.11;
        double inss = salBruto*0.08;
        double sindicato = salBruto * 0.05;
        double salarioLiquido = (salBruto - ir-inss-sindicato);

        System.out.println("Salário Bruto: "+salBruto);
        System.out.println("Imposto Renda: "+ir);
        System.out.println("INSS: "+inss);
        System.out.println("Sindicato: "+sindicato);
        System.out.println("Salário Líquido: "+salarioLiquido);
    }
}
