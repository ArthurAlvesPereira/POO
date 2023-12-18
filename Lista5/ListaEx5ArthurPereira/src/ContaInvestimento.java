import java.math.BigDecimal;

public class ContaInvestimento extends Tributavel {
    public ContaInvestimento(String cliente, String numeroConta, BigDecimal saldo) {
        super(cliente, numeroConta, saldo);
    }

    @Override
    public void sacar(BigDecimal valor) {
        if (valor.compareTo(saldo) == 1){
            System.out.println("Este valor não pode ser sacado");
        } else {
            saldo = saldo.subtract(valor);
            System.out.println("Foram sacados R$" +valor);
        }
    }

    public void calcularNovoSaldo(BigDecimal taxa){
        saldo = saldo.add(saldo.multiply(taxa));
    }

    public BigDecimal calcularTributo(BigDecimal taxa) {
        BigDecimal lucro = saldo.multiply(taxa);
        BigDecimal aux = new BigDecimal("0.05");
        return lucro.multiply(aux);
    }

    public BigDecimal calcularTaxaAdministracao(BigDecimal taxa){
        BigDecimal lucro = saldo.multiply(taxa);
        BigDecimal taxaAdm = new BigDecimal("0.01");
        return lucro.multiply(taxaAdm);
    }
}
