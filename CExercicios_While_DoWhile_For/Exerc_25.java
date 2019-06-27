package CExercicios_While_DoWhile_For;

import java.util.Scanner;

public class Exerc_25 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont=1;
        double tot=0, val=1;

      while (cont>0) {
          System.out.println("Lojas Tabajara");
          while (val > 0) {
              System.out.println("Informe o valor do Produto " + cont);
              val = ler.nextDouble();
              tot += val;
              cont++;

              System.out.println("Total: " + tot);
              System.out.println("Informe o Dinheiro");
              double din = ler.nextDouble();
              System.out.println("Troco: R$ " + (din - tot));
          }
      }

    }
}
