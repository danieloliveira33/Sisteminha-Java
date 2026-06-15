package questao3;

public abstract class Publicacao {

    protected String titulo;
    protected String autor;
    protected int ano;

    public Publicacao(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("\n[" + getClass().getSimpleName() + "]");
        System.out.println("  Título : " + titulo);
        System.out.println("  Autor  : " + autor);
        System.out.println("  Ano    : " + ano);
    }

    public abstract String citar();
    public String getTitulo() { return titulo; }
    public String getAutor()  { return autor; }

}
