package BExerciciosControles_Decisoes_Loops;

import java.util.Scanner;

public class Exerc_20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont=0;

        System.out.println("Informe se telefonou para a vítima? 1-sim 2-não");
        int resp1=ler.nextInt();
        if(resp1==1){
            cont++;
        }
        System.out.println("Informe se esteve no local do crime? 1-sim 2-não");
        int resp2=ler.nextInt();
        if(resp2==1){
            cont++;
        }
        System.out.println("Informe se mora perto da vítima? 1-sim 2-não");
        int resp3=ler.nextInt();
        if(resp3==1){
            cont++;
        }
        System.out.println("Informe se devia para a vítima? 1-sim 2-não");
        int resp4=ler.nextInt();
        if(resp4==1){
            cont++;
        }
        System.out.println("Informe se trabalhou com a vítima? 1-sim 2-não");
        int resp5=ler.nextInt();
        if(resp5==1){
            cont++;
        }
        if(cont>1 && cont<=2){
            System.out.println("Você é Suspeito");
        }else if(cont<=4){
            System.out.println("Você é Cumplice");
        }else if(cont<=5){
            System.out.println("Você é culpado");
        }else{
            System.out.println("Você é Inocênte");
        }
    }
}
