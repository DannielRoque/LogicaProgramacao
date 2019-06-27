package DExercicios_Vetor;

import java.util.Random;

public class Exerc_22 {
    public static void main(String[] args) {
      Random gerar = new Random();

      int[] a = new int[10];
      int maior=0,menor=0;

      for(int i=0;i<a.length;i++){
          a[i]=gerar.nextInt(20)+1;
      }

      maior=a[0];
      menor=a[0];


      for(int i=0;i<a.length;i++){
          if(a[i]<menor){
              menor=a[i];
          }else if(a[i]>maior){
              maior=a[i];
          }
      }
        System.out.println("Maior: "+maior+" Menor; "+menor);
    }
}
