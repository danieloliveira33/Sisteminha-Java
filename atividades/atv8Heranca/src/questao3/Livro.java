package questao3;

public class Livro extends Publicacao {

    private String editora;
    private int numerodePaginas;
    private int edicao;

    public Livro(String titulo, String autor, int ano, String editora, int numerodePaginas, int edicao) {
        super(titulo, autor, ano);
        this.editora = editora;
        this.numerodePaginas = numerodePaginas;
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("  Editora  : " + editora);
        System.out.println("  Páginas  : " + numerodePaginas);
        System.out.println("  Edição   : " + edicao + "ª");
    }

    @Override
    public String citar() {
        return autor + " (" + ano + "). " + titulo + ". " + editora + ". " + edicao + "ª ed.";
    }

}
