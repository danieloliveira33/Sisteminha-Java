package questao8;

public class Aluno extends Usuario{

    private String curso;

    public Aluno(String nome, String cpf, String matricula, String curso) {
        super(nome, cpf, matricula);
        this.curso = curso;
    }

    @Override
    public int limiteDeLivros() { return 3; }

    @Override
    public String toString() {
        return super.toString() + " | Curso: " + curso;
    }

}
