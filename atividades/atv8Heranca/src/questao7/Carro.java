package questao7;

public class Carro extends Veiculo{

    private int numerodePortas;

    public Carro(String marca, String modelo, int ano, double preco, int numerodePortas) {
        super(marca, modelo, ano, preco);
        this.numerodePortas = numerodePortas;
    }

    @Override
    public void exibirTipo() {
        System.out.printf("[Carro] %s %s (%d) — %d portas — R$ %.2f%n",
                marca, modelo, ano, numerodePortas, preco);
    }

}
