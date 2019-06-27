package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a tabuada desejada");
        int tab=ler.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println("Tabuada: "+tab+" x "+i+" = "+(tab*i));
        }
    }
}
