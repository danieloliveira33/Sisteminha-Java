package questao10;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private String nome;
    private int idVendedor;
    private List<Produto> produtos;

    public Vendedor(String nome, int idVendedor) {
        this.nome = nome;
        this.idVendedor = idVendedor;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("PRODUTO CADASTRADO POR " + nome + ": " + produto.getNome() + " | R$ " + produto.getPreco() + " | ESTOQUE: " + produto.getEstoque());
    }

    public void listarProdutos() {
        System.out.println("  VENDEDOR: " + nome + " | ID: " + idVendedor);
        for (Produto p : produtos) {
            System.out.println("    PRODUTO: " + p.getNome() + " | R$ " + p.getPreco() + " | ESTOQUE: " + p.getEstoque());
        }
    }

    public List<Produto> getProdutos() { return produtos; }
    public String getNome() { return nome; }
    public int getIdVendedor() { return idVendedor; }
}