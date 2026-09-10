package br.edu.exemplo.primeiraaplicacao.repository;

import br.edu.exemplo.primeiraaplicacao.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository
        extends JpaRepository<Professor, Long> {
}
