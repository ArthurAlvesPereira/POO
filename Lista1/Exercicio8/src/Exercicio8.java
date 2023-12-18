import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número inteiro:");
            n = sc.nextInt();
            System.out.println("O valor da " + n + "-ésima posição na sequência de Fibonacci é: " + fibonacci(n));
        }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
