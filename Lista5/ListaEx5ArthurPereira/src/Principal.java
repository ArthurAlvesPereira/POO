import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<ContaBancaria> contas = new ArrayList<>();



        while(true){
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar conta");
            System.out.println("2. Sacar");
            System.out.println("3. Atualizar conta poupança");
            System.out.println("4. Depositar");
            System.out.println("5. Mostrar saldo");
            System.out.println("6. Calcular tributos");
            System.out.println("7. Calcular taxa de administração");
            System.out.println("8. Sair");
            int opcao = sc.nextInt();
            String numeroConta;

            switch (opcao) {
                case 1 -> {
                    System.out.println("Qual tipo de conta voce deseja criar?");
                    System.out.println("1. Conta corrente");
                    System.out.println("2. Conta poupança");
                    System.out.println("3. Conta investimento");
                    opcao = sc.nextInt(); //Trocar por construtor
                    System.out.println("Qual o nome do cliente?");
                    String nomeCliente = sc.next();
                    System.out.println("Qual o numero da conta?");
                    String nConta = sc.next();
                    for (ContaBancaria cb : contas) {
                        if (cb.numeroConta.equals(nConta)) {
                            System.out.println("Essa conta não pode ter esse numero!");
                        }
                    }
                    System.out.println("Qual o saldo?");
                    BigDecimal saldo = sc.nextBigDecimal();
                    if (opcao == 1) {
                        System.out.println("Qual o limite?");
                        BigDecimal limite = sc.nextBigDecimal();
                        ContaCorrente cc = new ContaCorrente(nomeCliente, nConta, saldo, limite);
                        contas.add(cc);
                    } else if (opcao == 2) {
                        ContaPoupanca cp = new ContaPoupanca(nomeCliente, nConta, saldo);
                        contas.add(cp);
                    } else if (opcao == 3) {
                        ContaInvestimento ci = new ContaInvestimento(nomeCliente, nConta, saldo);
                        contas.add(ci);
                    } else {
                        System.out.println("Opção invalida");
                    }
                }
                case 2 -> {
                    System.out.println("Qual conta voce deseja sacar?");
                    numeroConta = sc.next();
                    for (ContaBancaria cb : contas) {
                        if (cb.getNumeroConta().equals(numeroConta)) {
                            System.out.println("Qual o valor deseja sacar?");
                            cb.sacar(sc.nextBigDecimal());
                        }
                    }
                }
                case 3 -> {
                    // Implementação da atualização da conta
                    System.out.println("Qual conta voce deseja atualizar?");
                    numeroConta = sc.next();
                    for (ContaBancaria cb : contas) {
                        if (cb.getNumeroConta().equals(numeroConta)) {
                            System.out.println("Qual a taxa de rendimento?");
                            BigDecimal taxa = sc.nextBigDecimal();
                            if (cb instanceof ContaPoupanca cp) {
                                cp.calcularNovoSaldo(taxa);
                            } else if (cb instanceof ContaInvestimento ci) {
                                ci.calcularNovoSaldo(taxa);
                            } else if (cb instanceof ContaCorrente) {
                                System.out.println("Essa conta é uma conta corrente!");
                            }
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Qual conta voce deseja depositar?");
                    numeroConta = sc.next();
                    for (ContaBancaria cb : contas) {
                        if (cb.getNumeroConta().equals(numeroConta)) {
                            System.out.println("Qual valor deseja depositar?");
                            cb.depositar(sc.nextBigDecimal());
                        }
                    }
                }
                // Implementação do depósito
                case 5 -> {
                    // Implementação para mostrar o saldo
                    System.out.println("Qual conta deseja ver o saldo");
                    numeroConta = sc.next();
                    for (ContaBancaria cb : contas) {
                        if (cb.getNumeroConta().equals(numeroConta)) {
                            System.out.println("Saldo disponivel: R$" + cb.getSaldo());
                        }
                    }
                }
                case 6 -> {
                    System.out.println("Qual conta deseja calcular os tributos?");
                    numeroConta = sc.next();
                    for (ContaBancaria cb : contas) {
                        if (cb.numeroConta.equals(numeroConta)) {
                            if (cb instanceof ContaInvestimento ci) {
                                System.out.println("Qual o valor da taxa?");
                                BigDecimal taxa = sc.nextBigDecimal();
                                System.out.println("O tributo da conta é R$" + ci.calcularTributo(taxa));
                            }
                        }
                    }
                }
                case 7 -> {
                    System.out.println("Qual conta deseja calcular a taxa de administração?");
                    numeroConta = sc.next();
                    for (ContaBancaria cb : contas) {
                        if (cb.numeroConta.equals(numeroConta)) {
                            if (cb instanceof ContaInvestimento ci) {
                                System.out.println("Qual o valor da taxa?");
                                BigDecimal taxa = sc.nextBigDecimal();
                                System.out.println("O tributo da conta é R$" + ci.calcularTaxaAdministracao(taxa));
                            }
                        }
                    }
                }
                case 8 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        }
    }
}
