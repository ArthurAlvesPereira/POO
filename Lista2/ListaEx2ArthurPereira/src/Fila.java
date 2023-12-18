import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Fila {
    public static void main(String[] args){

        SecureRandom s = new SecureRandom();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> fila = new ArrayList<>();

        while(true){
            System.out.println("\n1. Emitir nova senha");
            System.out.println("2. Desistir da fila");
            System.out.println("3. Atender usuário");
            System.out.println("4. Buscar posição na fila");
            System.out.println("5. Imprimir fila");
            System.out.println("6. Sair");

            System.out.print("\nEscolha uma opção: ");

            int opcao = sc.nextInt();

            if (opcao == 1) {
                int senha = s.nextInt(9000) + 1000;
                fila.add(senha);
                System.out.println("Senha emitida: " + senha);
            } else if (opcao == 2) {
                System.out.print("Digite a senha para remover da fila: ");
                int senha = sc.nextInt();
                if (fila.remove((Integer) senha)) {
                    System.out.println("Senha " + senha + " removida da fila.");
                } else {
                    System.out.println("Senha não encontrada na fila.");
                }
            } else if (opcao == 3) {
                if (!fila.isEmpty()) {
                    System.out.println("Atendendo usuário com senha: " + fila.remove(0));
                } else {
                    System.out.println("Nenhum usuário na fila.");
                }
            } else if (opcao == 4) {
                System.out.print("Digite a senha para buscar na fila: ");
                int senha = sc.nextInt();
                int posicao = fila.indexOf(senha);
                if (posicao != -1) {
                    System.out.println("A senha " + senha + " está na posição " + (posicao + 1) + " da fila.");
                } else {
                    System.out.println("Senha não encontrada na fila.");
                }
            } else if (opcao == 5) {
                if (!fila.isEmpty()) {
                    System.out.println("Fila atual:");
                    int i = 1;
                    for (int se : fila) {
                        System.out.println(i++ + ". Senha: " + se);
                    }
                } else {
                    System.out.println("Nenhum usuário na fila.");
                }
            } else if (opcao == 6) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
