import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        int n_triangles;
        int n_levels;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos triangulos haverão:");
        n_triangles = sc.nextInt();
        System.out.println("Digite quantos niveis cada triangulo tera:");;
        n_levels = sc.nextInt();

        for (int i = 0; i < n_triangles; i++){
            for (int j = 1; j <= n_levels; j++){
                for (int k = 0; k < j; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }


    }
}
