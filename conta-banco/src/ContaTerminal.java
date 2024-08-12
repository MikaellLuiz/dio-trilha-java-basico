import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int conta;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.print("Digite o número da conta: ");
        conta = sc.nextInt();

        sc.nextLine();
        System.out.print("Digite o numero da Agencia: ");
        agencia = sc.nextLine();
        
        System.out.print("Digite seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.print("Digite o saldo da conta: ");
        saldo = sc.nextDouble();

        sc.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %.2f já está disponível para saque", nomeCliente, agencia, conta, saldo);


    }
}
