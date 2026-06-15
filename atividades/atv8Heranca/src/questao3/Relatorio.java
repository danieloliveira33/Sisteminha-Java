package questao3;

public class Relatorio extends Publicacao{

    private String instituicao;
    private String numeroRelatorio;
    private boolean confidencial;

    public Relatorio(String titulo, String autor, int ano,
                     String instituicao, String numeroRelatorio, boolean confidencial) {
        super(titulo, autor, ano);
        this.instituicao = instituicao;
        this.numeroRelatorio = numeroRelatorio;
        this.confidencial = confidencial;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("  Instituição : " + instituicao);
        System.out.println("  Nº Relatório: " + numeroRelatorio);
        System.out.println("  Confidencial: " + (confidencial ? "Sim" : "Não"));
    }

    @Override
    public String citar() {
        String conf = confidencial ? " [CONFIDENCIAL]" : "";
        return autor + " (" + ano + "). " + titulo + ". " + instituicao +
                ". Rel. nº " + numeroRelatorio + "." + conf;
    }

}
