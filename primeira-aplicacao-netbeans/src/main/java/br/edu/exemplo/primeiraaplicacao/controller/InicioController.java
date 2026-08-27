package br.edu.exemplo.primeiraaplicacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

    @GetMapping("/")
    public String inicio() {
        return "Minha primeira aplicação Spring Boot!";
    }

    @GetMapping("/aluno")
    public String aluno() {
        return "Aluno: João da Silva";
    }

    @GetMapping("/curso")
    public String curso() {
        return "Curso: Sistemas de Informação";
    }

    @GetMapping("/disciplina")
    public String disciplina() {
        return "Disciplina: Desenvolvimento de Sistemas Web II";
    }

    @GetMapping("/saudacao")
    public String saudacao(@RequestParam(defaultValue = "Aluno") String nome) {
        return "Olá, " + nome + "!";
    }

    @GetMapping("/tecnologia")
    public String tecnologia() {
        return "Tecnologia utilizada: Java + Spring Boot";
    }
}
