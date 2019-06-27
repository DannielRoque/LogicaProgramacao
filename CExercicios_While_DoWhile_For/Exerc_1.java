package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;

//        System.out.println("Informe um valor válido entre 0-10");
//        num = ler.nextInt();

//        while (num<0 || num>10){
//            System.out.println("Número ínválido");
//            System.out.println("Informe um numero entre 0-10");
//            num=ler.nextInt();
//        }
//        System.out.println("Número válido: "+num);

        do{
            System.out.println("Informe um número entre 0-10");
            num=ler.nextInt();
        }while (num<0 || num>10);
        System.out.println("Número válido "+ num);
    }
}
