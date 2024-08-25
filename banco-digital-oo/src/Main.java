import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Criando o banco e clientes
        Banco banco = new Banco();
        banco.setNome("Banco Exemplo");
        banco.setContas(new ArrayList<>());

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Venilton");
        cliente1.setSenha("1234"); // Autenticação

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria");
        cliente2.setSenha("abcd"); // Autenticação

        // Criando as contas
        ContaCorrente cc = new ContaCorrente(cliente1, 500); // Limite de 500
        ContaPoupanca cp = new ContaPoupanca(cliente1);
        ContaCorrente ccMaria = new ContaCorrente(cliente2, 1000); // Limite de 1000

        // Adicionando as contas ao banco
        banco.getContas().add(cc);
        banco.getContas().add(cp);
        banco.getContas().add(ccMaria);

        // Funcionalidade 1: Testando depósito e saque
        cc.depositar(200);
        cc.sacar(100); // Deve funcionar
        cc.sacar(700); // Deve funcionar, usando o limite
        cc.sacar(200); // Deve falhar, excedendo o limite

        // Funcionalidade 2: Testando transferência entre contas
        cc.transferir(50, cp); // Transferir 50 para a poupança

        // Funcionalidade 3: Testando aplicação de juros na poupança
        cp.aplicarJurosMensal(); // Aplicando juros de 5%

        // Funcionalidade 4: Gerando o extrato de cada conta
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        // Funcionalidade 5: Testando histórico de transações
        cc.mostrarHistorico();

        // Relatório geral do banco
        banco.gerarRelatorio();

        // Funcionalidade extra: Autenticação de clientes
        if (cliente1.autenticar("1234")) {
            System.out.println(cliente1.getNome() + " autenticado com sucesso!");
        } else {
            System.out.println("Falha na autenticação do cliente " + cliente1.getNome());
        }

        if (cliente2.autenticar("errada")) {
            System.out.println(cliente2.getNome() + " autenticado com sucesso!");
        } else {
            System.out.println("Falha na autenticação do cliente " + cliente2.getNome());
        }
    }
}
