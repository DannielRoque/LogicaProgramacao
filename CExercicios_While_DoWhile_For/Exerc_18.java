package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont=0,num;

        System.out.println("Informe o valor para a consulta se é primo");
        num = ler.nextInt();

        for(int i=1;i<=num;i++){
            if(num%i==0){
                cont++;
            }
        }
        if(cont>0 && cont==2){
            System.out.println("Numero é Primo: "+num);
        }else{
            System.out.println("Não é primo: "+num);
        }
    }
}
