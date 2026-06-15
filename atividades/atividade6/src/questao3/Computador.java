package questao3;

public class Computador {
    private String marca;
    private Processador processador;
    private MemoriaRam memoriaRam;
    private DiscoRigido discoRigido;

    public Computador(String marca, String modeloProc, int nucleos, double freqGHz,
                      int ramGB, String tipoRAM, int discoGB, String tipoDisco) {
        this.marca = marca;
        this.processador = new Processador(modeloProc, nucleos, freqGHz);
        this.memoriaRam = new MemoriaRam(ramGB, tipoRAM);
        this.discoRigido = new DiscoRigido(discoGB, tipoDisco);
    }

    public void exibirConfiguracao() {
        System.out.println("COMPUTADOR: " + marca);
        System.out.println("  PROCESSADOR: " + processador.getModelo() + " | NUCLEOS: " + processador.getNucleos() + " | FREQUENCIA: " + processador.getFrequenciaGHz() + " GHz");
        System.out.println("  MEMORIA RAM: " + memoriaRam.getCapacidadeGB() + "GB | TIPO: " + memoriaRam.getTipo());
        System.out.println("  DISCO: " + discoRigido.getCapacidadeGB() + "GB | TIPO: " + discoRigido.getTipoArmazenamento());
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
}
