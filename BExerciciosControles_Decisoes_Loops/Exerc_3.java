package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o sexo 'F' ou 'M'");
        String letra = ler.next();
        if(letra.toUpperCase().equals("F")){
            System.out.println("Sexo Feminino: "+letra);
        }else if(letra.toUpperCase().equals("M")){
            System.out.println("Masculino: "+letra);
        }else{
            System.out.println("Sexo inválido, informe 'M' ou 'F'");
        }
    }
}
