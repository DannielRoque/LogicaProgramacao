package CExercicios_While_DoWhile_For;

public class Exerc_23 {
    public static void main(String[] args) {

        double prod= 1.99;
        double tot;

        System.out.println("Lojas Quase Dois - Tabela de Preços");
        for(int i=1;i<=50;i++){
            tot = prod*i;
            System.out.println(i+" - R$: "+tot);
        }
    }
}
