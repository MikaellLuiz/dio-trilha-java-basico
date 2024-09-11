package com.prof.avalia.service;

import com.prof.avalia.interfaces.CalculoNotaStrategy;
import com.prof.avalia.model.Avaliacao;
import org.springframework.stereotype.Service;

/**
 * Implementação da Strategy para o cálculo ponderado.
 * Exemplo simples: a nota é multiplicada por 2.
 */
@Service
public class CalculoNotaPonderada implements CalculoNotaStrategy {

    @Override
    public int calcularNota(Avaliacao avaliacao) {
        // Exemplo: nota ponderada com um fator de multiplicação.
        return avaliacao.getNota() * 2;
    }
}
