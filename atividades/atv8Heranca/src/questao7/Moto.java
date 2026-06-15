package questao7;

public class Moto extends Veiculo{

    private int cilindradas;

    public Moto(String marca, String modelo, int ano, double preco, int cilindradas) {
        super(marca, modelo, ano, preco);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirTipo() {
        System.out.printf("[Moto] %s %s (%d) — %dcc — R$ %.2f%n",
                marca, modelo, ano, cilindradas, preco);
    }

}
