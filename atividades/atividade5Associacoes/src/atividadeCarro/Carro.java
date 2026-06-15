package atividadeCarro;

public class Carro {

    private String cor;
    private String modelo;
    private double preco;
    private double velocidade;
    private Motor motor;

    public Carro() {
    }

    public Carro (String modelo, double preco) {
        this.cor = "PRETA";
        this.modelo = modelo;
        this.preco = preco;
    }

    public Carro (String cor, String modelo, double preco) {
        this.cor = cor;
        this.modelo = modelo;
        this.preco = preco;
    }

    public Carro (String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void acelerar(double newVelocidade) {
        velocidade = newVelocidade;
        System.out.println("CARRO A: KM/H" + velocidade);
    }

    public void reduzir(double newVelocidade) {
        if (velocidade == 0) {
            System.out.println("CARRO PARADO");
        }else {
            velocidade -= newVelocidade;
            if (velocidade < 0) {
                velocidade = 0;
            }
            System.out.println("CARRO A: KM/H" + velocidade);
        }
    }

    public void pararCarro () {
        velocidade = 0;
        System.out.println("CARRO PARADO");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
