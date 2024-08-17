package telefonia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        List<String> servicosContratados = new ArrayList<>();
        int i = 0;

        for (String parte : partes){
            if (parte.equals(servico)){
                servicosContratados.add(parte);
                i++;
            }
        }
        if(!servicosContratados.isEmpty()){
            System.out.println("Sim");
        }else{
            System.out.println("Nao");
        }
        scanner.close();
    }

}