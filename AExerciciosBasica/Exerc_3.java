package AExerciciosBasica;

import java.util.Scanner;

public class Exerc_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a 1° nota bimestral");
        int n1=ler.nextInt();

        System.out.println("Informe a 2° nota bimestral");
        int n2=ler.nextInt();

        System.out.println("Informe a 3° nota bimestral");
        int n3 = ler.nextInt();

        System.out.println("Informe a 4° nota bimestral");
        int n4 = ler.nextInt();

        int tot=n1+n2+n3+n4;
        double med = tot/4;
        System.out.println("Média bimestral: "+med);
    }
}
