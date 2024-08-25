
public class ContaPoupanca extends Conta {
	private static final double TAXA_JUROS = 0.05;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void aplicarJurosMensal() {
        double juros = saldo * TAXA_JUROS;
        depositar(juros);
    }

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanca ===");
		super.imprimirInfosComuns();
	}
}
