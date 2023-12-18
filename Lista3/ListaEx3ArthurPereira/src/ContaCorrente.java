import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria{
    private BigDecimal limite;

    public ContaCorrente(String cliente, String numeroConta, BigDecimal saldo, BigDecimal limite) {
        super(cliente, numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(BigDecimal valor) {
        if (saldo.subtract(valor).compareTo(limite.negate()) >= 0) {
            saldo = saldo.subtract(valor);
        } else {
            System.out.println("Limite excedido!");
        }
    }
}
