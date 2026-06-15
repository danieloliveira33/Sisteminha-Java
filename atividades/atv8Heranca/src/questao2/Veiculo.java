package questao2;

public abstract class Veiculo {

    protected String marca;
    protected String modelo;
    protected int ano;
    protected double velocidadeAtual;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public abstract void acelerar(double novaVelocidade);

    public void frear(double decremento) {
        velocidadeAtual = velocidadeAtual - decremento;
        System.out.printf("%s %s freando... %.1f km/h%n", marca, modelo, velocidadeAtual);
    }

    public void exibirInfo() {
        System.out.printf("[%s] %s %s (%d)%n", getClass().getSimpleName(), marca, modelo, ano);
    }

}
