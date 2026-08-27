# primeira-aplicacao-netbeans

Projeto único que junta o conteúdo dos 4 PDFs da disciplina DSW II (Aula 1 + Tutoriais 01, 02 e 03).

## Como abrir no NetBeans

1. Abra o NetBeans.
2. `File > Open Project`.
3. Selecione a pasta `primeira-aplicacao-netbeans` (a que contém o `pom.xml`, **não** a pasta `src`).
4. Aguarde o Maven baixar as dependências.
5. Clique com o botão direito em `PrimeiraAplicacaoApplication.java` > `Run File`.
6. Acesse `http://localhost:8080` no navegador.

Se a porta 8080 estiver ocupada, descomente `server.port=8081` em `src/main/resources/application.properties`.

## O que veio de cada PDF

- **Aula 1 (slides):** conceitos (cliente/servidor, HTTP, Spring, Spring Boot) + `InicioController` com rotas de texto simples.
- **Tutorial 01:** mesmo projeto rodando no NetBeans, com as rotas `/`, `/aluno`, `/curso`, `/disciplina`, `/saudacao`, `/tecnologia`.
- **Tutorial 02:** Spring MVC + Thymeleaf — `PaginaController`, páginas HTML (`inicio.html`, `perfil.html`, `disciplina.html`) e o CSS em `static/css/style.css`.
- **Tutorial 03:** formulários — `AlunoController`, classe `Aluno` (model), `cadastro-aluno.html` (formulário POST) e `resultado-aluno.html` (confirmação com Data Binding).

## Rotas disponíveis

| Rota | Tipo | O que faz |
|---|---|---|
| `/` | texto | Mensagem inicial |
| `/aluno` | texto | Nome do aluno |
| `/curso` | texto | Nome do curso |
| `/disciplina` | texto | Nome da disciplina |
| `/saudacao?nome=Maria` | texto | Saudação com parâmetro |
| `/tecnologia` | texto | Tecnologia usada |
| `/pagina` | HTML (Thymeleaf) | Página inicial com título/mensagem |
| `/perfil?nome=Maria` | HTML (Thymeleaf) | Perfil com parâmetro |
| `/disciplina-web` | HTML (Thymeleaf) | Dados da disciplina em página |
| `/alunos/novo` | HTML (formulário GET) | Formulário de cadastro de aluno |
| `/alunos/salvar` | POST | Recebe o formulário e mostra `resultado-aluno.html` |

## Estrutura

```
src/main/java/br/edu/exemplo/primeiraaplicacao
├── PrimeiraAplicacaoApplication.java
├── controller
│   ├── InicioController.java     (rotas de texto - @RestController)
│   ├── PaginaController.java     (páginas Thymeleaf - @Controller)
│   └── AlunoController.java      (formulário GET/POST - @Controller)
└── model
    └── Aluno.java                (nome, curso, email, idade)

src/main/resources
├── application.properties
├── static/css/style.css
└── templates
    ├── inicio.html
    ├── perfil.html
    ├── disciplina.html
    ├── cadastro-aluno.html
    └── resultado-aluno.html
```

## Próximos passos sugeridos (fim do Tutorial 03)

- Bean Validation (`@Valid`, `@NotBlank`, `@Email`, `@Size`) com mensagens de erro no formulário.
- `th:object` / `th:field` no `cadastro-aluno.html`.
- Padrão Post/Redirect/Get (`return "redirect:/alunos";`).
