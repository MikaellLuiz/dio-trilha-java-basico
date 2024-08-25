public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(Cliente cliente, double limite) {
        super(cliente);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente com o limite.");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
        System.out.println(String.format("Limite: %.2f", this.limite));
    }
}
