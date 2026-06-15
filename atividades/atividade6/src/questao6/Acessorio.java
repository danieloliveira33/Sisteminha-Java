package questao6;

public class Acessorio {
    private String nome;
    private double preco;

    public Acessorio(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
}