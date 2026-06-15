package questao2;

public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void acelerar(double incremento) {
        velocidadeAtual += incremento * 1.3;
        System.out.printf("%s %s (%dcc) acelera forte: %.1f km/h%n", marca, modelo, cilindradas, velocidadeAtual);
    }

    public void empinar() {
        if (velocidadeAtual > 20)
            System.out.println(modelo + " empinando! Cuidado!");
        else
            System.out.println("Velocidade insuficiente para empinar.");
    }

}
