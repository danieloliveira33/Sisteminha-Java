package questao3;

public class DiscoRigido {
    private int capacidadeGB;
    private String tipoArmazenamento;

    public DiscoRigido(int capacidadeGB, String tipoArmazenamento) {
        this.capacidadeGB = capacidadeGB;
        this.tipoArmazenamento = tipoArmazenamento;
    }

    public int getCapacidadeGB() { return capacidadeGB; }
    public String getTipoArmazenamento() { return tipoArmazenamento; }
}
