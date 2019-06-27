package CExercicios_While_DoWhile_For;

public class Exerc_4 {
    public static void main(String[] args) {

        int habA = 80000, habB = 200000, cont=0,resp=0,resp2=0;

        while (habB > habA) {
           habA += habA * 0.03;
           habB +=habB * 0.015;
            cont++;
        }
        System.out.println("Em "+cont+" anos o país A será igual ou maior que o país B");
    }
}
