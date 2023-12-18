import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        String name;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        name = sc.next();
        System.out.println("Agora digite quantas vezes sera repitido:");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println(name);
        }
    }
}
