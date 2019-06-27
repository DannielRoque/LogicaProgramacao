package AExerciciosBasica;

import java.util.Scanner;

public class Exerc_13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe se sexo 1:'mulher' ou 2:'homen' ");
        int s = ler.nextInt();

        if(s==1){
            System.out.println("Informe sua altura");
            double alt =ler.nextDouble();
            double peso = (62.1* alt)-44.7;
            System.out.println("Peso ideal: "+peso);
        }else if(s==2){
            System.out.println("Informe sua altura");
            double alt = ler.nextDouble();
            double peso = (72.7*alt)-58;
            System.out.printf("Peso ideal: "+peso);
        }


    }
}
