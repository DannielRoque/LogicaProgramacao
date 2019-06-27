package DExercicios_Vetor;

import java.util.Random;

public class Exerc_15 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[]a = new int[10];
        int impar=150,par=200;

        for(int i=0;i<a.length;i++){
            a[i]=gerar.nextInt(50)+1;

            if(a[i]%2==0){
                par+=a[i];
            }else{
                impar+=a[i];
            }
        }
        int tot = impar+par;
        double tot1 = (impar/tot)*100;
        double tot2 = (par/tot)*100;
        System.out.println("Porcentagem impar: "+tot1+" Porcentagem par: "+tot2);
    }
}
