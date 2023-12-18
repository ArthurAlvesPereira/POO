import java.math.BigDecimal;

public class ContaBancaria {
    protected String cliente;
    protected String numeroConta;
    protected BigDecimal saldo;

    public ContaBancaria(String cliente, String numeroConta, BigDecimal saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void sacar(BigDecimal valor) {
        if (saldo.compareTo(valor) >= 0) {
            saldo = saldo.subtract(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(BigDecimal valor){
        saldo = saldo.add(valor);
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}
