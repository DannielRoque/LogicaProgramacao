package AExerciciosBasica;

import java.util.Scanner;

public class Exerc_16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont=0;
        System.out.println("Informe a medida da Area a ser pintada");
        int med = ler.nextInt();

        float qtdTinta = (med/3);
        System.out.println("Será utilizado "+qtdTinta+" litro(s)");

        for(int i=0; i<qtdTinta; i+=18){
            cont ++;
        }
        System.out.println("Será necessário "+cont+" latas, total: "+cont*80+" reais");
    }
}
