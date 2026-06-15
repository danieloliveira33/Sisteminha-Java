package questao9;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
    private List<Curso> cursos;

    public Universidade(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("CURSO ADICIONADO A " + nome + ": " + curso.getNome());
    }

    public void removerCurso(Curso curso) {
        if (cursos.remove(curso)) {
            System.out.println("CURSO REMOVIDO: " + curso.getNome());
        } else {
            System.out.println("CURSO NAO ENCONTRADO: " + curso.getNome());
        }
    }

    public void listarCursos() {
        System.out.println("UNIVERSIDADE: " + nome);
        if (cursos.isEmpty()) {
            System.out.println("  NENHUM CURSO CADASTRADO.");
        } else {
            for (Curso c : cursos) {
                c.listarCurso();
            }
        }
    }

    public String getNome() { return nome; }

    // Adicionar logo após o método listarCursos(), antes do getNome()

    public void listarCursosDoAluno(Aluno aluno) {
        System.out.println("CURSOS DO ALUNO: " + aluno.getNome() + " | MATRICULA: " + aluno.getMatricula());
        boolean encontrou = false;
        for (Curso c : cursos) {
            if (c.getAlunos().contains(aluno)) {
                System.out.println("  - " + c.getNome());
                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("  NENHUM CURSO ENCONTRADO.");
    }

    public void listarCursosDoProfessor(Professor professor) {
        System.out.println("CURSOS DO PROFESSOR: " + professor.getNome());
        boolean encontrou = false;
        for (Curso c : cursos) {
            if (c.getProfessores().contains(professor)) {
                System.out.println("  - " + c.getNome());
                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("  NENHUM CURSO ENCONTRADO.");
    }
}