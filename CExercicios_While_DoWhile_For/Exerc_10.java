package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o 1° valor");
        int val1= ler.nextInt();
        System.out.println("Informe o 2° valor");
        int val2=ler.nextInt();

        for(int i=val1+1;i<val2;i++){
            System.out.println("Intervalo: "+i);
        }

    }
}
