package questao5;

public abstract class ObraArte extends ItemCultural{

    protected String artista;
    protected double valorEstimado;

    public ObraArte(String titulo, int anoCriacao, String origem,
                      String artista, double valorEstimado) {
        super(titulo, anoCriacao, origem);
        this.artista = artista;
        this.valorEstimado = valorEstimado;
    }

    @Override
    public void descrever() {
        super.descrever();
        System.out.printf("  Artista: %s | Valor estimado: R$ %,.2f%n", artista, valorEstimado);
    }

}
