package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int cont=0,idade=0,tot=0;


        do{
            System.out.println("Informe a idade");
            idade = ler.nextInt();
            tot+=idade;
            cont++;
        }while (idade>0);

        if(idade>0 && idade<=12){
            System.out.println("Média é de Criança(s) "+(tot/cont));
        }else if(idade<=18){
            System.out.println("Média é de adolescente(s) "+(tot/cont));
        }else if(idade<=30){
            System.out.println("Média é de Jovem(s) "+(tot/cont));
        }else if(idade<=45){
            System.out.println("Média é de Adulto(s) "+(tot/cont));
        }else{
            System.out.println("Média é de Idoso(s) "+(tot/cont));
        }
    }
}
