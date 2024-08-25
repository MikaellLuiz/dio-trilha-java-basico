import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void gerarRelatorio() {
        System.out.println("=== Relatório do Banco ===");
        double saldoTotal = 0;
        for (Conta conta : contas) {
            saldoTotal += conta.getSaldo();
            System.out.println(String.format("Conta: %d | Titular: %s | Saldo: %.2f", conta.getNumero(), conta.cliente.getNome(), conta.getSaldo()));
        }
        System.out.println(String.format("Saldo total do banco: %.2f", saldoTotal));
    }

}
