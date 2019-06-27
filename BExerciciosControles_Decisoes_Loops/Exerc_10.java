package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe Periodo em que frequenta escola 'M' matutino 'V' vesperino 'N' noturno");
        String v1=ler.nextLine();

        v1 = v1.toUpperCase();
        switch(v1){
            case "M":
                System.out.println("Bom Dia !"); break;
            case "V":
                System.out.println("Boa Tarde !"); break;
            case "N":
                System.out.println("Boa Noite !"); break;
                default:
                    System.out.println("Valor Inválido");
        }


    }
}
