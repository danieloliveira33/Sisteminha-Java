package questao3;

public class Processador {
    private String modelo;
    private int nucleos;
    private double frequenciaGHz;

    public Processador(String modelo, int nucleos, double frequenciaGHz) {
        this.modelo = modelo;
        this.nucleos = nucleos;
        this.frequenciaGHz = frequenciaGHz;
    }

    public String getModelo() { return modelo; }
    public int getNucleos() { return nucleos; }
    public double getFrequenciaGHz() { return frequenciaGHz; }
}