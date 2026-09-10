package br.edu.exemplo.primeiraaplicacao.controller;

import br.edu.exemplo.primeiraaplicacao.model.Aluno;
import br.edu.exemplo.primeiraaplicacao.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping("/alunos")
    public String listar(Model model) {
        model.addAttribute(
                "alunos",
                alunoService.listarTodos()
        );
        return "lista-alunos";
    }

    @GetMapping("/alunos/novo")
    public String novo(Model model) {
        model.addAttribute(
                "aluno",
                new Aluno()
        );
        return "cadastro-aluno";
    }

    @PostMapping("/alunos/salvar")
    public String salvar(
            @Valid Aluno aluno,
            BindingResult resultado) {
        if (resultado.hasErrors()) {
            return "cadastro-aluno";
        }

        alunoService.salvar(aluno);

        return "redirect:/alunos";
    }

    @GetMapping("/alunos/editar/{id}")
    public String editar(
            @PathVariable Long id,
            Model model) {
        model.addAttribute(
                "aluno",
                alunoService.buscarPorId(id)
        );
        return "cadastro-aluno";
    }

    @GetMapping("/alunos/excluir/{id}")
    public String excluir(
            @PathVariable Long id) {
        alunoService.excluir(id);
        return "redirect:/alunos";
    }
}
