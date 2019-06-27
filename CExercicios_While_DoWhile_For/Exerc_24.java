package CExercicios_While_DoWhile_For;

import java.text.DecimalFormat;

public class Exerc_24 {
    public static void main(String[] args) {

        double pao=0.18,tot;
        DecimalFormat res = new DecimalFormat("0.##");
        System.out.println("Padaria Pão de Ontem  - Tabela de Preços");
        for(int i=1; i<=50; i++){
            tot=pao*i;
            System.out.println(i+" - R$: "+res.format(tot));
        }
    }
}
