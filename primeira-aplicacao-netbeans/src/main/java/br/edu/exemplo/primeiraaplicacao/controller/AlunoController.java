package br.edu.exemplo.primeiraaplicacao.controller;

import br.edu.exemplo.primeiraaplicacao.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlunoController {

    @GetMapping("/alunos/novo")
    public String formularioAluno() {
        return "cadastro-aluno";
    }

    @PostMapping("/alunos/salvar")
    public String salvarAluno(Aluno aluno, Model model) {
        model.addAttribute("aluno", aluno);
        return "resultado-aluno";
    }
}
