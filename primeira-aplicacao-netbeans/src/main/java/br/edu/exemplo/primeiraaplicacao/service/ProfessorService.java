package br.edu.exemplo.primeiraaplicacao.service;

import br.edu.exemplo.primeiraaplicacao.model.Professor;
import br.edu.exemplo.primeiraaplicacao.repository.ProfessorRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    private final ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    public Professor salvar(Professor professor) {
        return repository.save(professor);
    }

    public List<Professor> listarTodos() {
        return repository.findAll();
    }

    public Professor buscarPorId(Long id) {
        return repository.findById(id)
                .orElse(null);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
