package DExercicios_Vetor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc_19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double cotacao;
        double[] a=new double[20];

        System.out.println("Informe a cotação do Dólar sobre o Real");
        cotacao=ler.nextDouble();

        for(int i=0; i<20;i++){
            a[i]= cotacao*(i+1);
            System.out.println("Valor Sobre a Cotação: "+a[i]);
        }


    }
}

