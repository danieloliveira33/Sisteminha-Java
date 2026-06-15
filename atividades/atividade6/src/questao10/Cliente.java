package questao10;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private int idCliente;
    private List<Produto> produtosComprados;

    public Cliente(String nome, int idCliente) {
        this.nome = nome;
        this.idCliente = idCliente;
        this.produtosComprados = new ArrayList<>();
    }

    public void comprar(Produto produto, int quantidade) {
        if (produto.vender(quantidade)) {
            produtosComprados.add(produto);
            System.out.println("COMPRA REALIZADA: " + nome + " comprou " + quantidade + "x " + produto.getNome() + " | R$ " + (produto.getPreco() * quantidade));
        } else {
            System.out.println("ESTOQUE INSUFICIENTE PARA: " + produto.getNome());
        }
    }

    public void listarCompras() {
        System.out.println("  CLIENTE: " + nome + " | ID: " + idCliente);
        if (produtosComprados.isEmpty()) {
            System.out.println("    NENHUMA COMPRA REALIZADA.");
        } else {
            for (Produto p : produtosComprados) {
                System.out.println("    PRODUTO: " + p.getNome() + " | R$ " + p.getPreco());
            }
        }
    }

    public String getNome() { return nome; }
    public int getIdCliente() { return idCliente; }
}