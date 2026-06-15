package questao7;

public class Caminhao extends Veiculo{

    private double cargaMaxima;
    private int eixos;

    public Caminhao(String marca, String modelo, int ano, double preco,
                    double cargaMaxima, int eixos) {
        super(marca, modelo, ano, preco);
        this.cargaMaxima = cargaMaxima;
        this.eixos = eixos;
    }

    @Override
    public void exibirTipo() {
        System.out.printf("[Caminhão] %s %s (%d) — %.0f t — %d eixos — R$ %.2f%n",
                marca, modelo, ano, cargaMaxima, eixos, preco);
    }

}
