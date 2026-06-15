package questao8;

public class Professor extends Usuario{

    private String disciplina;

    public Professor(String nome, String cpf, String matricula, String disciplina) {
        super(nome, cpf, matricula);
        this.disciplina = disciplina;
    }

    @Override
    public int limiteDeLivros() { return 8; }

    @Override
    public String toString() {
        return super.toString() + " | Disciplina: " + disciplina;
    }

}
