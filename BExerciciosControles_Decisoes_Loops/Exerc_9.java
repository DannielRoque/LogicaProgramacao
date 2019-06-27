package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe 1º valor");
        int v1=ler.nextInt();
        System.out.println("Informe 2º valor");
        int v2=ler.nextInt();
        System.out.println("Informe 3º valor");
        int v3=ler.nextInt();

        if(v1>v2 && v2>v3){
            System.out.println("Maior "+v1+" Mediano "+v2+" Menor "+v3);
        }else if(v1>v3 && v3>v2){
            System.out.println("Maior "+v1+" Mediano "+v3+" Menor "+v2);
        }else if(v2>v1 && v1>v3){
            System.out.println("Maior "+v2+" Mediano "+v1+" Menor "+v3);
        }else if(v2>v3 && v3>v1){
            System.out.println("Maior "+v2+" Mediano "+v3+" Menor "+v1);
        }else if(v3>v1 && v1>v2){
            System.out.println("Maior "+v3+" Mediano "+v1+" Menor "+v2);
        }else if(v3>v2 && v2>v1){
            System.out.println(v3+""+v2+""+v1);
        }else{
            System.out.println("Valores informados não se encaixam no padrão desta aplicação.");
        }

    }
}
