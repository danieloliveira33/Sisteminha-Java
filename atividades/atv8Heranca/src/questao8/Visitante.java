package questao8;

public class Visitante extends Usuario{

    public Visitante(String nome, String cpf, String matricula) {
        super(nome, cpf, matricula);
    }

    @Override
    public int limiteDeLivros() { return 1; }
}
