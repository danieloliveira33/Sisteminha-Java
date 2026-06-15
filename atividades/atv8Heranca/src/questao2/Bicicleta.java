package questao2;

public class Bicicleta extends Veiculo {

    private int numerodeMarchas;
    private int marchaAtual;

    public Bicicleta(String marca, String modelo, int ano, int numerodeMarchas) {
        super(marca, modelo, ano);
        this.numerodeMarchas = numerodeMarchas;
        this.marchaAtual = 1;
    }

    @Override
    public void acelerar(double novaVelocidade) {
        velocidadeAtual += novaVelocidade * 0.4;
        System.out.printf("%s %s pedalando: %.1f km/h%n", marca, modelo, velocidadeAtual);
    }

    public void trocarMarcha(int marcha) {
        if (marcha >= 1 && marcha <= numerodeMarchas) {
            this.marchaAtual = marcha;
            System.out.println(modelo + " trocou para marcha " + marcha + ".");
        } else {
            System.out.println("Marcha " + marcha + " inválida para este modelo.");
        }
    }

}
