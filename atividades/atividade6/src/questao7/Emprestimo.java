package questao7;

public class Emprestimo {
    private Livro livro;
    private String dataEmprestimo;

    public Emprestimo(Livro livro, String dataEmprestimo) {
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Livro getLivro() { return livro; }
    public String getDataEmprestimo() { return dataEmprestimo; }
}