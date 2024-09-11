package com.prof.avalia.repository;

import com.prof.avalia.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * O repositório é um Singleton no Spring por padrão.
 * Ele permite operações CRUD com a entidade Avaliacao.
 */
@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
}
