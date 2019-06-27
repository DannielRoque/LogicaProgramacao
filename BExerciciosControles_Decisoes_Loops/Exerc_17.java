package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um ano");
        int ano = ler.nextInt();

        if((ano % 4 ==0) || (ano%400==0) && (ano%100!=0)){
            System.out.println("Ano  é Bissexto: "+ano);
        }else{
            System.out.println("Ano não é Bissexto: "+ano);
        }
    }
}
