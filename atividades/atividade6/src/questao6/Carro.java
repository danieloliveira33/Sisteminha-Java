package questao6;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, double preco, int numeroDePortas) {
        super(marca, modelo, ano, preco);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void exibirVeiculo() {
        System.out.print("CARRO | PORTAS: " + numeroDePortas + " | ");
        super.exibirVeiculo();
    }

    public int getNumeroDePortas() { return numeroDePortas; }
}