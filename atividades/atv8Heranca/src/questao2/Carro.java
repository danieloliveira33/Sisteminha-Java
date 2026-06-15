package questao2;

public class Carro extends Veiculo {

    private int numerodePortas;
    private boolean arCondicionado;

    public Carro(String marca, String modelo, int ano, int numerodePortas) {
        super(marca, modelo, ano);
        this.numerodePortas = numerodePortas;
        this.arCondicionado = false;
    }

    @Override
    public void acelerar(double incremento) {
        velocidadeAtual += incremento * 0.9;
        System.out.printf("%s %s (carro) acelera suavemente: %.1f km/h%n", marca, modelo, velocidadeAtual);
    }

    public void ligarArCondicionado() {
        this.arCondicionado = true;
        System.out.println("Ar-condicionado do " + modelo + " ligado.");
    }

}
