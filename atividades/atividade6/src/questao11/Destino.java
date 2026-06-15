package questao11;

public class Destino {
    private String nome;
    private String pais;
    private String descricao;

    public Destino(String nome, String pais, String descricao) {
        this.nome = nome;
        this.pais = pais;
        this.descricao = descricao;
    }

    public String getNome() { return nome; }
    public String getPais() { return pais; }
    public String getDescricao() { return descricao; }
}