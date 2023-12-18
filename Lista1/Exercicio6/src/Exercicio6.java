import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n_lines;
        System.out.println("Qual o numero de linhas?:");
        n_lines = sc.nextInt();
        for (int i = 1; i <= n_lines; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
