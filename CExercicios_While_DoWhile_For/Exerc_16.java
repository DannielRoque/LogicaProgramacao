package CExercicios_While_DoWhile_For;

public class Exerc_16 {
    public static void main(String[] args) {
        int a=0,b=1,fib=0;

        while (fib<500){
            a=b;
            b=fib;
            fib=a+b;
            System.out.println("Fibonacci "+fib);
        }
    }
}
