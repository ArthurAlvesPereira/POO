import java.math.BigDecimal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = null;

        while (true) {
            System.out.println("1. Criar conta poupança");
            System.out.println("2. Criar conta corrente");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Mostrar saldo");
            System.out.println("6. Atualizar conta poupança");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o cliente: ");
                    String clientePoupanca = scanner.next();
                    System.out.print("Informe o número da conta: ");
                    String numeroContaPoupanca = scanner.next();
                    System.out.print("Informe o saldo inicial: ");
                    BigDecimal saldoPoupanca = scanner.nextBigDecimal();
                    System.out.print("Informe o dia do rendimento: ");
                    int diaRendimento = scanner.nextInt();
                    conta = new ContaPoupanca(clientePoupanca, numeroContaPoupanca, saldoPoupanca, diaRendimento);
                    break;
                case 2:
                    System.out.print("Informe o cliente: ");
                    String clienteCorrente = scanner.next();
                    System.out.print("Informe o número da conta: ");
                    String numeroContaCorrente = scanner.next();
                    System.out.print("Informe o saldo inicial: ");
                    BigDecimal saldoCorrente = scanner.nextBigDecimal();
                    System.out.print("Informe o limite: ");
                    BigDecimal limite = scanner.nextBigDecimal();
                    conta = new ContaCorrente(clienteCorrente, numeroContaCorrente, saldoCorrente, limite);
                    break;
                case 3:
                    System.out.print("Informe o valor a depositar: ");
                    BigDecimal valorDeposito = scanner.nextBigDecimal();
                    conta.depositar(valorDeposito);
                    break;
                case 4:
                    System.out.print("Informe o valor a sacar: ");
                    BigDecimal valorSaque = scanner.nextBigDecimal();
                    conta.sacar(valorSaque);
                    break;
                case 5:
                    conta.mostrarSaldo();
                    break;
                case 6:
                    if (conta instanceof ContaPoupanca) {
                        System.out.print("Informe a taxa de rendimento: ");
                        BigDecimal taxaRendimento = scanner.nextBigDecimal();
                        ((ContaPoupanca) conta).calcularNovoSaldo(taxaRendimento);
                    } else {
                        System.out.println("A conta não é poupança!");
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
