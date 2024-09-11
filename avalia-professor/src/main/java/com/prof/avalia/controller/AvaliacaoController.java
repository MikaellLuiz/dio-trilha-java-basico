package com.prof.avalia.controller;

import com.prof.avalia.model.Avaliacao;
import com.prof.avalia.repository.AvaliacaoRepository;
import com.prof.avalia.service.CalculoNotaContext;
import com.prof.avalia.service.CalculoNotaMediaSimples;
import com.prof.avalia.service.CalculoNotaPonderada;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Controlador da aplicação.
 * Utiliza o padrão Singleton para o repositório e o contexto da estratégia de cálculo.
 */
@Controller
public class AvaliacaoController {

    // Injeção do repositório (Singleton)
    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    // Injeção do contexto de cálculo de nota (Singleton que usa Strategy)
    @Autowired
    private CalculoNotaContext calculoNotaContext;

    /**
     * Exibe o formulário de avaliação.
     */
    @GetMapping("/avaliacao")
    public String exibirFormulario(Model model) {
        model.addAttribute("avaliacao", new Avaliacao());
        return "avaliacao-form";
    }

    /**
     * Processa o envio do formulário de avaliação.
     * Aplica a estratégia de cálculo de nota.
     */
    @PostMapping("/avaliacao")
    public String processarFormulario(@Valid @ModelAttribute("avaliacao") Avaliacao avaliacao,
                                      BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "avaliacao-form";
        }

        // Exemplo de troca dinâmica de estratégia
        if (avaliacao.getNota() > 5) {
            // Se a nota for maior que 5, use a estratégia de média simples
            calculoNotaContext.setStrategy(new CalculoNotaMediaSimples());
        } else {
            // Caso contrário, use a estratégia ponderada
            calculoNotaContext.setStrategy(new CalculoNotaPonderada());
        }

        // Executa o cálculo da nota com a estratégia escolhida
        int notaFinal = calculoNotaContext.executarCalculo(avaliacao);
        avaliacao.setNota(notaFinal);

        // Salva a avaliação no banco de dados (Singleton)
        avaliacaoRepository.save(avaliacao);

        model.addAttribute("mensagem", "Avaliação salva com sucesso!");
        return "resultado";
    }

    /**
     * Exibe a lista de todas as avaliações presentes no banco de dados.
     */
    @GetMapping("/avaliacoes")
    public String listarAvaliacoes(Model model) {
        List<Avaliacao> avaliacoes = avaliacaoRepository.findAll(); // Busca todas as avaliações do banco
        model.addAttribute("avaliacoes", avaliacoes); // Adiciona as avaliações ao modelo
        return "avaliacao-list"; // Direciona para a visualização "avaliacao-list"
    }
}
