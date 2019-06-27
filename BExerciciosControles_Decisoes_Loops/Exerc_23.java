package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_23 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double kilos=0,tot=0;
        System.out.println("Informe qual carne levará, apenas 1 opção pode ser escolhida");
        System.out.println("1- Filé Duplo   2- Alcatra   3- Picanha");
        int opcao=ler.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Quantos Kilo(s) levará");
                kilos = ler.nextDouble();
                if(kilos>0 && kilos<=5){
                    tot=kilos* 4.90;
                }else {
                    tot=kilos*5.80;
                }break;
            case 2:
                System.out.println("Quantos Kilo(s) levará");
                kilos = ler.nextDouble();
                if(kilos>0 && kilos<=5){
                    tot=kilos* 5.90;
                }else {
                    tot=kilos*6.80;
                }break;
            case 3:
                System.out.println("Quantos Kilo(s) levará");
                kilos = ler.nextDouble();
                if(kilos>0 && kilos<=5){
                    tot=kilos* 6.90;
                }else {
                    tot=kilos*7.80;
                }break;
        }
        System.out.println("Método de pagamento 1: Dinheiro  2:cartão");
        int esc=ler.nextInt();
        if(esc==1){
            System.out.printf("Levará "+kilos+" com total de R$: "+tot);
        }else if(esc==2){
            double desc=tot*0.05;
            System.out.println("Levará "+kilos+" com total de R$: "+(tot-desc));
        }else{
            System.out.println("Opção inválida");
        }
    }
}
