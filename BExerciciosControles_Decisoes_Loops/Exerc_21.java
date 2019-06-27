package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_21 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valA=1.90;
        double valG=2.50;
        double litro,desc;
        System.out.println("Informe o tipo de combustível A-álcool G-gasolina");
        String tipo=ler.next();
        tipo= tipo.toUpperCase();
        switch (tipo){
            case "A":
                System.out.println("Informe a quantidade de litros");
                 litro=ler.nextDouble();
                 valA*=litro;

                if(litro>0 && litro <=20){
                    desc=valA*0.03;

                }else {
                    desc= valA*0.5;
                }
                System.out.println("Quantidade de alcool: "+litro+" Valor: "+(valA-desc)); break;
            case "G":
                System.out.println("Informe a quantidade de litros");
                 litro=ler.nextDouble();
                    valG*=litro;

                if(litro>0 && litro<=20){
                    desc=valG*0.04;
                }else{
                    desc= valG*0.06;
                }
                System.out.println("Quantidade de gasolina: "+litro+" Valor: "+(valG-desc)); break;
                default:
                    System.out.println("A opção informada não é acessível");
        }
    }
}
