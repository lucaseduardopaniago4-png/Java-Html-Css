package br.edu.exemplo.primeiraaplicacao.repository;

import br.edu.exemplo.primeiraaplicacao.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository
        extends JpaRepository<Aluno, Long> {
}
