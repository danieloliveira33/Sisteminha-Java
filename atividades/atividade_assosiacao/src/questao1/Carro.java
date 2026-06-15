package questao1;

public class Carro {

    private int anoLancamento;
    private String placa;
    private String modelo;
    private String motor;
    private boolean ligado;

    public Carro (int anoLancamento, String placa, String modelo, String motor, boolean ligado) {
        this.anoLancamento = anoLancamento;
        this.placa = placa;
        this.modelo = modelo;
        this.motor = motor;
        this.ligado = false;
    }


    public void ligarCarro() {
        if (ligado == true) {
            System.out.println("JÁ ESTÁ LIGADO");
        }else {
            System.out.println("LIGANDO CARRO");
            ligado = true;
        }
    }


    public void setAnoLancamento(int newAno) {
        anoLancamento = newAno;
    }

    public void setPlaca(String newPlaca) {
        placa = newPlaca;
    }

    public void setModelo(String newModelo) {
        modelo = newModelo;
    }

    public void setMotor(String newMotor) {
        motor = newMotor;
    }

    public void setLigado(boolean newLigado) {
        ligado = newLigado;
    }
    //=============================================================================================
    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMotor() {
        return motor;
    }

    public boolean getLigado() {
        return ligado;
    }
}
