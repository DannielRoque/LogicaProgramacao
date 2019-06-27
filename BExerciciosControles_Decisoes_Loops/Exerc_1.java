package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um valor");
        int val1=ler.nextInt();

        System.out.println("Informe mais um valor");
        int val2 = ler.nextInt();

        if(val1>val2){
            System.out.println("Maior Valor: "+val1+ " Menor Valor: "+val2);
        }else{
            System.out.println("Maior Valor: "+val2+" Menor Valor: "+val1);
        }
    }
}
