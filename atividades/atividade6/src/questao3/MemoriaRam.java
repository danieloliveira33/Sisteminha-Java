package questao3;

public class MemoriaRam {
    private int capacidadeGB;
    private String tipo;

    public MemoriaRam(int capacidadeGB, String tipo) {
        this.capacidadeGB = capacidadeGB;
        this.tipo = tipo;
    }

    public int getCapacidadeGB() {
        return capacidadeGB;
    }
    public String getTipo() {
        return tipo;
    }
}
