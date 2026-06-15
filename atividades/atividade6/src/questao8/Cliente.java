package questao8;

public class Cliente {
    private String nome;
    private int idCliente;

    public Cliente(String nome, int idCliente) {
        this.nome = nome;
        this.idCliente = idCliente;
    }

    public String getNome() { return nome; }
    public int getIdCliente() { return idCliente; }
}