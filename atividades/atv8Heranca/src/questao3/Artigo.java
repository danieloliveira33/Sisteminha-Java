package questao3;

public class Artigo extends Publicacao {

    private String conferencia;
    private String doi;

    public Artigo(String titulo, String autor, int ano, String conferencia, String doi) {
        super(titulo, autor, ano);
        this.conferencia = conferencia;
        this.doi = doi;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("  Conferência: " + conferencia);
        System.out.println("  DOI        : " + doi);
    }

    @Override
    public String citar() {
        return autor + " (" + ano + "). " + titulo + ". In: " + conferencia + ". DOI: " + doi;
    }

}
