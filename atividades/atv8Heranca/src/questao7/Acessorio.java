package questao7;

public class Acessorio {

    private String nome;
    private double preco;
    private String descricao;

    public Acessorio(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNome()  { return nome; }
    public double getPreco() { return preco; }

    @Override
    public String toString() {
        return String.format("%s — R$ %.2f (%s)", nome, preco, descricao);
    }

}
