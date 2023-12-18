import java.math.BigDecimal;
import java.util.Random;

public abstract class ContaBancaria {

    Random rand = new Random();
    protected String cliente;
    protected String numeroConta;
    protected BigDecimal saldo;

    public ContaBancaria(String cliente,String numeroConta, BigDecimal saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public abstract void sacar(BigDecimal valor);

    public void depositar(BigDecimal valor){
        System.out.println("Foram depositados R$" +valor) ;
    }
}
