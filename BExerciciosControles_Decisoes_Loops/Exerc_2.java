package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o Valor");
        int val = ler.nextInt();

        if(val>=0){
            System.out.println("Valor Positivo: "+val);
        }else{
            System.out.println("Valor Negativo: "+val);
        }
    }
}
