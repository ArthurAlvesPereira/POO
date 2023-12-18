import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria {
    private BigDecimal limite;
    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    public ContaCorrente(String cliente,String numeroConta, BigDecimal saldo, BigDecimal limite) {
        super(cliente, numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(BigDecimal valor) {
        if (valor.compareTo(saldo.add(limite)) == 1){
            System.out.println("Este valor não pode ser sacado");
        } else {
            saldo = saldo.subtract(valor);
            System.out.println("Foram sacados " +valor);
        }
    }

}
