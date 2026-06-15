package questao6;

public class Moto extends Veiculo {
    private String cilindradas;

    public Moto(String marca, String modelo, int ano, double preco, String cilindradas) {
        super(marca, modelo, ano, preco);
        this.cilindradas = cilindradas;
    }

    @Override //protege e puxa o metodo do pai
    public void exibirVeiculo() {
        System.out.print("MOTO | CILINDRADAS: " + cilindradas + " | ");
        super.exibirVeiculo();
    }

    public String getCilindradas() { return cilindradas; }
}