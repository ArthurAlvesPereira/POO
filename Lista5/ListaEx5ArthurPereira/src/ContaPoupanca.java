import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria {
    @Override
    public void sacar(BigDecimal valor) {
        if (valor.compareTo(saldo) == 1){
            System.out.println("Este valor não pode ser sacado");
        } else {
            saldo = saldo.subtract(valor);
            System.out.println("Foram sacados R$" +valor);
        }
    }

    public ContaPoupanca(String cliente,String numeroConta, BigDecimal saldo) {
        super(cliente,numeroConta, saldo);
    }



    public void calcularNovoSaldo(BigDecimal taxa){
        saldo = saldo.add(saldo.multiply(taxa));
        //arrumar para porcentagem
    }
}
