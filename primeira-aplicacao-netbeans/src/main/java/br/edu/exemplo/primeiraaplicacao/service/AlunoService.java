package br.edu.exemplo.primeiraaplicacao.service;

import br.edu.exemplo.primeiraaplicacao.model.Aluno;
import br.edu.exemplo.primeiraaplicacao.repository.AlunoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public Aluno salvar(Aluno aluno) {
        return repository.save(aluno);
    }

    public List<Aluno> listarTodos() {
        return repository.findAll();
    }

    public Aluno buscarPorId(Long id) {
        return repository.findById(id)
                .orElse(null);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
