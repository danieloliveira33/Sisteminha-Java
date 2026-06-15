package questao8;

public class Emprestimo {

    private Livro livro;
    private Usuario usuario;
    private String dataEmprestimo;

    public Emprestimo(Livro livro, Usuario usuario, String dataEmprestimo) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Livro getLivro()     { return livro; }
    public Usuario getUsuario() { return usuario; }

    @Override
    public String toString() {
        return usuario.getNome() + " → " + livro.getTitulo() + " (desde " + dataEmprestimo + ")";
    }

}
