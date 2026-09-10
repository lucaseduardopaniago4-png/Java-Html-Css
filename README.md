<div align="center">

# 🎓 Sistema Acadêmico — Alunos & Professores

Aplicação web full-stack em **Spring Boot** para gestão de alunos e professores, com CRUD completo, validação de formulários e persistência em PostgreSQL.

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.4-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

</div>

---

## ✨ Funcionalidades

- **CRUD completo de Alunos** — cadastrar, listar, editar e excluir.
- **CRUD completo de Professores** — módulo independente, com titulação (Especialista / Mestre / Doutor / Pós-Doutor).
- **Validação de formulários** (Bean Validation) com mensagens de erro por campo e resumo geral.
- **Modal de confirmação** antes de excluir qualquer registro — nada é apagado com um único clique.
- **Arquitetura em camadas**: `Controller → Service → Repository → Entity`, com Spring Data JPA + Hibernate.
- **Tema escuro moderno**, paleta *teal* (`#008B8B`), navegação em abas entre os módulos.

## 🧱 Stack

| Camada | Tecnologia |
|---|---|
| Linguagem | Java 17 |
| Framework | Spring Boot 3.3.4 (Web, Thymeleaf, Validation, Data JPA) |
| Banco de dados | PostgreSQL |
| Build | Maven (com Maven Wrapper — não precisa instalar Maven) |
| Front-end | Thymeleaf + CSS puro (sem frameworks) |

## 📂 Estrutura do projeto

```
primeira-aplicacao-netbeans/
├── src/main/java/br/edu/exemplo/primeiraaplicacao/
│   ├── PrimeiraAplicacaoApplication.java
│   ├── controller/     (InicioController, PaginaController, AlunoController, ProfessorController)
│   ├── service/        (AlunoService, ProfessorService)
│   ├── repository/     (AlunoRepository, ProfessorRepository)
│   └── model/          (Aluno, Professor — entidades JPA com Bean Validation)
│
└── src/main/resources/
    ├── application.properties
    ├── static/css/style.css
    └── templates/       (cadastro-aluno, cadastro-professor, lista-alunos, lista-professores, ...)
```

## 🚀 Como rodar localmente

### Pré-requisitos
- Java 17
- PostgreSQL rodando localmente

### 1. Clone o repositório
```bash
git clone https://github.com/lucaseduardopaniago4-png/Java-Html-Css.git
cd Java-Html-Css/primeira-aplicacao-netbeans
```

### 2. Crie o banco de dados
```sql
CREATE DATABASE sistema_alunos;
```

### 3. Configure as credenciais do banco

As credenciais **não ficam no código** — são lidas de variáveis de ambiente.

**Windows (PowerShell):**
```powershell
[Environment]::SetEnvironmentVariable("DB_USERNAME", "postgres", "User")
[Environment]::SetEnvironmentVariable("DB_PASSWORD", "sua_senha_aqui", "User")
```
*(feche e reabra o terminal/IDE depois de definir)*

**Linux / macOS:**
```bash
export DB_USERNAME=postgres
export DB_PASSWORD=sua_senha_aqui
```

### 4. Rode a aplicação
```bash
# Linux / macOS
./mvnw spring-boot:run

# Windows
mvnw.cmd spring-boot:run
```

### 5. Acesse
```
http://localhost:8080/alunos
http://localhost:8080/professores
```

## 🗺️ Rotas principais

| Rota | Método | Descrição |
|---|---|---|
| `/alunos` | GET | Lista de alunos cadastrados |
| `/alunos/novo` | GET | Formulário de cadastro |
| `/alunos/salvar` | POST | Cria ou atualiza um aluno |
| `/alunos/editar/{id}` | GET | Formulário preenchido para edição |
| `/alunos/excluir/{id}` | GET | Remove um aluno |
| `/professores` | GET | Lista de professores cadastrados |
| `/professores/novo` | GET | Formulário de cadastro |
| `/professores/salvar` | POST | Cria ou atualiza um professor |
| `/professores/editar/{id}` | GET | Formulário preenchido para edição |
| `/professores/excluir/{id}` | GET | Remove um professor |

## 🧭 Roadmap

- [ ] Consultas personalizadas (`findByNome`, `findByCurso`, `findByNomeContainingIgnoreCase`)
- [ ] Paginação e ordenação (`Pageable`, `Sort`)
- [ ] Autenticação e autorização com Spring Security
- [ ] Relacionamento entre Aluno e Professor (ex: disciplinas lecionadas)

## 📄 Licença

Projeto desenvolvido para fins acadêmicos, na disciplina de Desenvolvimento de Sistemas Web II.
