package questao5;

public class Fotografia extends ObraArte {

    private String formato;
    private int tiragem;

    public Fotografia(String titulo, int anoDeCreacao, String origem,
                      String artista, double valorEstimado, String formato, int tiragem) {
        super(titulo, anoDeCreacao, origem, artista, valorEstimado);
        this.formato = formato;
        this.tiragem = tiragem;
    }

    @Override
    public void descrever() {
        super.descrever();
        System.out.println("  Formato: " + formato + " | Tiragem: " + tiragem + " cópias");
    }

}
