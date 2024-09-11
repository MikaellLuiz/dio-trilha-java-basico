package com.prof.avalia.service;

import com.prof.avalia.interfaces.CalculoNotaStrategy;
import com.prof.avalia.model.Avaliacao;
import org.springframework.stereotype.Service;

/**
 * Implementação da Strategy para o cálculo de uma média simples.
 * Esta estratégia apenas retorna a nota conforme inserida.
 */
@Service
public class CalculoNotaMediaSimples implements CalculoNotaStrategy {

    @Override
    public int calcularNota(Avaliacao avaliacao) {
        // Simplesmente retorna a nota inserida.
        return avaliacao.getNota();
    }
}
