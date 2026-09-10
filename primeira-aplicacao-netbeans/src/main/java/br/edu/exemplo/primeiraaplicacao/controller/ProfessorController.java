package br.edu.exemplo.primeiraaplicacao.controller;

import br.edu.exemplo.primeiraaplicacao.model.Professor;
import br.edu.exemplo.primeiraaplicacao.service.ProfessorService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping("/professores")
    public String listar(Model model) {
        model.addAttribute(
                "professores",
                professorService.listarTodos()
        );
        return "lista-professores";
    }

    @GetMapping("/professores/novo")
    public String novo(Model model) {
        model.addAttribute(
                "professor",
                new Professor()
        );
        return "cadastro-professor";
    }

    @PostMapping("/professores/salvar")
    public String salvar(
            @Valid Professor professor,
            BindingResult resultado) {
        if (resultado.hasErrors()) {
            return "cadastro-professor";
        }

        professorService.salvar(professor);

        return "redirect:/professores";
    }

    @GetMapping("/professores/editar/{id}")
    public String editar(
            @PathVariable Long id,
            Model model) {
        model.addAttribute(
                "professor",
                professorService.buscarPorId(id)
        );
        return "cadastro-professor";
    }

    @GetMapping("/professores/excluir/{id}")
    public String excluir(
            @PathVariable Long id) {
        professorService.excluir(id);
        return "redirect:/professores";
    }
}
