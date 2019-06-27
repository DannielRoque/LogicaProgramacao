package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe valor de A");
        int a=ler.nextInt();
        if(a==0){
            System.out.println("Não é equação de Segundo Grau");
        }
        System.out.println("Informe o valor de B");
        int b = ler.nextInt();

        System.out.println("Informe o valor de C");
        int c=ler.nextInt();

        double delta = (b*b) - (4*a*c);
        if(delta <0){
            System.out.println("Delta negativo");
        }else{
            System.out.println("delta :" +delta);
            double x1 =(-b + Math.sqrt(delta)) / (2*a);
            double x2 =(-b - Math.sqrt(delta)) / (2*a);
            System.out.println("X1 :"+x1);
            System.out.println("X2 :"+x2);
        }
    }
}
