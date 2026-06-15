package questao9;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Professor> professores;
    private List<Aluno> alunos;

    public Curso(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("ALUNO MATRICULADO EM " + nome + ": " + aluno.getNome() + " | MATRICULA: " + aluno.getMatricula());
    }

    public void alocarProfessor(Professor professor) {
        professores.add(professor);
        System.out.println("PROFESSOR ALOCADO EM " + nome + ": " + professor.getNome() + " | " + professor.getTitulacao());
    }

    public void listarCurso() {
        System.out.println("  CURSO: " + nome);
        System.out.println("    PROFESSORES:");
        if (professores.isEmpty()) {
            System.out.println("      NENHUM.");
        } else {
            for (Professor p : professores) {
                System.out.println("      " + p.getNome() + " | " + p.getTitulacao());
            }
        }
        System.out.println("    ALUNOS:");
        if (alunos.isEmpty()) {
            System.out.println("      NENHUM.");
        } else {
            for (Aluno a : alunos) {
                System.out.println("      " + a.getNome() + " | MATRICULA: " + a.getMatricula());
            }
        }
    }

    public String getNome() { return nome; }
    public List<Professor> getProfessores() { return professores; }
    public List<Aluno> getAlunos() { return alunos; }
}