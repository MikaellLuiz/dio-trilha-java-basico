package com.prof.avalia.interfaces;

import com.prof.avalia.model.Avaliacao;

/**
 * Interface Strategy para o cálculo da nota de uma avaliação.
 * Permite a implementação de diferentes estratégias de cálculo.
 */
public interface CalculoNotaStrategy {
    int calcularNota(Avaliacao avaliacao);
}
