package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_26 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int fat=1;
        System.out.println("Informe um valor para fatoração");
        int val=ler.nextInt();
        System.out.println("Fatorial de: "+val);
        System.out.print(val+"! = ");
        for(int i=val; i>1;i--){
            fat *=i;
            System.out.print(fat+". ");
        }
    }
}
