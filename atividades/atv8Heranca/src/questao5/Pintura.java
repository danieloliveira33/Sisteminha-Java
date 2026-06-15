package questao5;

public class Pintura extends ObraArte{

    private String tecnica;
    private String dimensoes;

    public Pintura(String titulo, int anoCriacao, String origem,
                   String artista, double valorEstimado, String tecnica, String dimensoes) {
        super(titulo, anoCriacao, origem, artista, valorEstimado);
        this.tecnica = tecnica;
        this.dimensoes = dimensoes;
    }

    @Override
    public void descrever() {
        super.descrever();
        System.out.println("  Técnica: " + tecnica + " | Dimensões: " + dimensoes);
    }

}
