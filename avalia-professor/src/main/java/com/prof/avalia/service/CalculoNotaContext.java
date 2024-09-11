package com.prof.avalia.service;

import com.prof.avalia.interfaces.CalculoNotaStrategy;
import com.prof.avalia.model.Avaliacao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Classe Context que utiliza o padrão Strategy.
 * Armazena a estratégia de cálculo de nota a ser usada e a executa.
 */
@Service
public class CalculoNotaContext {

    private CalculoNotaStrategy strategy;

    // Injetando a estratégia padrão com @Qualifier
    public CalculoNotaContext(@Qualifier("calculoNotaMediaSimples") CalculoNotaStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Executa o cálculo da nota usando a estratégia atual.
     */
    public int executarCalculo(Avaliacao avaliacao) {
        return strategy.calcularNota(avaliacao);
    }

    /**
     * Altera a estratégia de cálculo de nota.
     */
    public void setStrategy(CalculoNotaStrategy strategy) {
        this.strategy = strategy;
    }
}
