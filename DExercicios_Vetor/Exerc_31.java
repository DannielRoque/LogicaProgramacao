package DExercicios_Vetor;

import java.util.Random;

public class Exerc_31 {
    public static void main(String[] args) {
        Random gerar = new Random();

        int[] a = new int[20];
        int[] b=new int[20];
        int aux;
        for(int i=0; i<a.length; i++){
            a[i]=gerar.nextInt(30)+1;
            System.out.print(" "+a[i]);
        }
        System.out.println();

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(a[j]%2==0){
                    aux=a[j];
                    a[j]=a[i];
                    a[i]=aux;
                }
            }
        }
        for(int v: a){
            System.out.print(" "+v);
        }

//        for(int i=0; i<a.length; i++){
//            for(int j=0; j<a.length; j++){
//                if(a[j]%2==0){
//                    aux=a[i];
//                    a[i]=a[j];
//                    a[j]=aux;
//                }
//            }
//        }
//        for(int v:a){
//            System.out.print(" "+v);
//        }

    }
}
