package com.prof.avalia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * Classe que representa uma Avaliação de professor.
 * Mantida simples para demonstrar a integração com o padrão Strategy.
 */
@Entity
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do professor é obrigatório")
    @Size(max = 100, message = "O nome do professor deve ter no máximo 100 caracteres")
    private String nomeProfessor;

    @NotBlank(message = "Os comentários são obrigatórios")
    @Size(max = 500, message = "Os comentários devem ter no máximo 500 caracteres")
    private String comentarios;

    @Min(1)
    @Max(10)
    private int nota;

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }
}
