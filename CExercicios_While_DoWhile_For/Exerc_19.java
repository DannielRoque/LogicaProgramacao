package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char resp='s';
        double tot=0;
        int cont=0;
        while (resp!='n'){
            System.out.println("Informe a nota");
            double nota=ler.nextDouble();
            tot +=nota;
            cont++;

            System.out.println("Deseja inserir Nota ?   's' ou 'n' ");
            resp=ler.next().charAt(0);
        }
        System.out.println("Média das notas: "+(tot/cont));
    }
}
