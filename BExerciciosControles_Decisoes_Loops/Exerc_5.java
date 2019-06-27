package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a primeira nota parcial do aluno");
        double n1= ler.nextDouble();

        System.out.println("Informe a segunda nota parcial do aluno");
        double n2= ler.nextDouble();

        double med = (n1+n2)/2;

        if(med == 10){
            System.out.println("Aprovado com distinção Nota: "+med);
        }else if(med>7){
            System.out.printf("Aprovado Nota: "+med);
        }else if(med>0){
            System.out.println("Reprovado Nota: "+med);
        }else{
            System.out.println("Nota inválida, informe corretamente");
        }
    }
}
