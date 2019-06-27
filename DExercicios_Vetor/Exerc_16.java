package DExercicios_Vetor;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Exerc_16 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[]a = new int[10];
        int soma=0,cont=0, sup=0,cont2=0;

        for(int i=0;i<a.length;i++){
            a[i]=gerar.nextInt(50)+1;
            if(a[i]==15){
                cont++;
            }else if(a[i]<15){
                soma+=a[i];
            }else if(a[i]>15){
                sup+=a[i];
                cont2++;
            }
        }
        System.out.println("Temos "+cont+" que são iguais a 15");
        System.out.println("Contudo temos a soma dos elementos menor que 15 são: "+soma);
        System.out.println("Com média dos valores superiores a 15: "+(sup/cont2)+" com "+cont2+" elemento maior que '15' ");
    }
}
