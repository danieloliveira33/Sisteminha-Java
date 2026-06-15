package questao8;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario extends Pessoa {

    protected String matricula;
    protected List<Livro> livrosEmprestados = new ArrayList<>();

    public Usuario(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public abstract int limiteDeLivros();

    public boolean podeEmprestar() {
        return livrosEmprestados.size() < limiteDeLivros();
    }

    public void receberLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    public String getMatricula() { return matricula; }

    @Override
    public String toString() {
        return nome + " [" + getClass().getSimpleName() + "] | Matrícula: " + matricula +
                " | Livros: " + livrosEmprestados.size() + "/" + limiteDeLivros();
    }

}
