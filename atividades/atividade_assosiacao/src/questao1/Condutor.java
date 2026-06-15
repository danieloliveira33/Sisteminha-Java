package questao1;

public class Condutor {

    private int idade;
    private String cnh;
    private double dinheiro;
    private int nivelBebado;

    public Condutor (int idade, String cnh, double dinheiro, int nivelBebado) {
        this.idade = idade;
        this.cnh = cnh;
        this.dinheiro = dinheiro;
        this.nivelBebado = nivelBebado;
    }

    public void pagarMulta(double valorMulta) {
        dinheiro -= valorMulta;
    }

    public void beber(int nivelBebado) {
        nivelBebado += nivelBebado;
    }

    //================================================================================================

    public void setIdade(int newIdade) {
        idade = newIdade;
    }

    public void setCnh(String newCnh) {
        cnh = newCnh;
    }

    public void setDinheiro(double newDinheiro) {
        dinheiro =+ newDinheiro;
    }

    public void setBebado(int alcoolismo) {
        nivelBebado = alcoolismo;
    }

//================================================================================

    public int getIdade() {
        return idade;
    }

    public String getCnh() {
        return cnh;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public int getBebado() {
        return nivelBebado;
    }

}
