package br.com.dio.desafio.dominio;

import java.util.Set;

public class Ranking {
    public static void exibirRanking(Set<Dev> devs) {
        System.out.println("Ranking DEVs");
        devs.stream()
            .sorted((d1, d2) -> Double.compare(d2.calcularTotalXp(), d1.calcularTotalXp()))
            .forEach(dev -> System.out.println(dev.getNome() + " - XP: " + dev.calcularTotalXp()));
        System.out.println("--- ---");
    }
}


