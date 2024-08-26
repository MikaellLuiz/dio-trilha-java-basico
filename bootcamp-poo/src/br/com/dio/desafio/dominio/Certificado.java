package br.com.dio.desafio.dominio;

public class Certificado {
    public static void emitirCertificado(Dev dev, Bootcamp bootcamp) {
        if (dev.getConteudosInscritos().isEmpty()) {
            System.out.println("Certificado emitido para " + dev.getNome() + " pelo Bootcamp " + bootcamp.getNome());
        } else {
            System.out.println("Ainda há conteúdos pendentes.");
        }
    }
}


