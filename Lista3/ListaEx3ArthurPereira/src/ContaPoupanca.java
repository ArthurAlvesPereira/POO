import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;

    public ContaPoupanca(String cliente, String numeroConta, BigDecimal saldo, int diaRendimento) {
        super(cliente, numeroConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(BigDecimal taxaRendimento) {
        saldo = saldo.add(saldo.multiply(taxaRendimento));
    }

    @Override
    public void sacar(BigDecimal valor) {
        if (saldo.compareTo(valor) >= 0) {
            saldo = saldo.subtract(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
