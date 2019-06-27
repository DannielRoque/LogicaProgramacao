package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont=1,par=0,impar=0;


        while (cont<=10){
            System.out.println("Informe um valor qualquer "+cont);
            int val=ler.nextInt();
            if(val%2==0){
                 par+=1;
            }else{
                impar+=1;
            }
            cont++;
        }
        System.out.println("Numeros Pares: "+par+" Numeros Impares: "+impar);
    }
}
