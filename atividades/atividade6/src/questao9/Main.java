package questao9;

public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Daniel", 20241001);
        Aluno a2 = new Aluno("Carla", 20241002);

        Professor p1 = new Professor("Dr. Ferreira", "Doutor", 501);
        Professor p2 = new Professor("Ma. Costa", "Mestre", 502);

        Curso c1 = new Curso("Ciencia da Computacao");
        Curso c2 = new Curso("Sistemas de Informacao");

        c1.alocarProfessor(p1);
        c1.matricularAluno(a1);
        c1.matricularAluno(a2);

        c2.alocarProfessor(p1); // mesmo professor em dois cursos
        c2.alocarProfessor(p2);
        c2.matricularAluno(a1); // mesmo aluno em dois cursos

        Universidade u1 = new Universidade("UFBA");
        u1.adicionarCurso(c1);
        u1.adicionarCurso(c2);

        System.out.println("---");
        u1.listarCursos();

        System.out.println("---");
        u1.listarCursosDoAluno(a1);
        System.out.println("---");
        u1.listarCursosDoProfessor(p1);
    }
}