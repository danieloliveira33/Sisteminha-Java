package atividadeCarro;

public class Motor {

    private String fabricante;
    private String combustivel;
    private double cilindrada;

    public Motor (String fabricante, String combustivel, double cilindrada) {
        this.fabricante = fabricante;
        this.combustivel = combustivel;
        this.cilindrada = cilindrada;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
}
