package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha a ação,  1- 'Par ou Impar'  ou  2- 'positivo ou Negativo'");
        int esc = ler.nextInt();

        if(esc == 1) {
            System.out.println("Informe o valor desejado");
            int val = ler.nextInt();
            if (val % 2 == 0) {
                System.out.println("Valor Par: " + val);
            } else {
                System.out.println("Valor Impar: " + val);
            }
        }else if(esc==2){
            System.out.println("Informe o valor desejado");
            int val = ler.nextInt();
            if(val>0){
                System.out.println("Valor é positivo: "+val);
            }else{
                System.out.println("Valor é negativo: "+val);
            }
        }else{
            System.out.println("Valor informado não identificado, informe um valor válido na escolha! ");
        }
    }
}
