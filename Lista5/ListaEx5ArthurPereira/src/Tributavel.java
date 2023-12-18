import java.math.BigDecimal;

public abstract class Tributavel extends ContaBancaria {
    public Tributavel(String cliente, String numeroConta, BigDecimal saldo) {
        super(cliente, numeroConta, saldo);
    }

    public abstract BigDecimal calcularTributo(BigDecimal taxaRendimento);
}
