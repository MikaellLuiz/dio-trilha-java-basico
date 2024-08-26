package br.com.dio.desafio.dominio;

public class Notificacao {
    public static void notificarNovosConteudos(Bootcamp bootcamp) {
        for (Dev dev : bootcamp.getDevsInscritos()) {
            System.out.println("Notificação: " + dev.getNome() + ", novos conteúdos foram adicionados ao Bootcamp " + bootcamp.getNome());
        }
    }
}


