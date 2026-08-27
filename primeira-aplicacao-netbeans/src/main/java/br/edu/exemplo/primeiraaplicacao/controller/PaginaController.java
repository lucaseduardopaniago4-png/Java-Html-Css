package br.edu.exemplo.primeiraaplicacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PaginaController {

    @GetMapping("/pagina")
    public String paginaInicial(Model model) {
        model.addAttribute("titulo", "Desenvolvimento de Sistemas Web II");
        model.addAttribute("mensagem", "Primeira página com Spring MVC e Thymeleaf");
        return "inicio";
    }

    @GetMapping("/perfil")
    public String perfil(@RequestParam(defaultValue = "Aluno") String nome, Model model) {
        model.addAttribute("nome", nome);
        return "perfil";
    }

    @GetMapping("/disciplina-web")
    public String disciplina(Model model) {
        model.addAttribute("disciplina", "Desenvolvimento de Sistemas Web II");
        model.addAttribute("curso", "Sistemas de Informação");
        model.addAttribute("semestre", "4º semestre");
        model.addAttribute("tecnologia", "Java + Spring Boot");
        return "disciplina";
    }
}
