package questao10;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
    private String nome;
    private List<Vendedor> vendedores;

    public Ecommerce(String nome) {
        this.nome = nome;
        this.vendedores = new ArrayList<>();
    }

    public void adicionarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
        System.out.println("VENDEDOR CADASTRADO NA PLATAFORMA " + nome + ": " + vendedor.getNome());
    }

    public void removerVendedor(Vendedor vendedor) {
        if (vendedores.remove(vendedor)) {
            System.out.println("VENDEDOR REMOVIDO: " + vendedor.getNome());
        } else {
            System.out.println("VENDEDOR NAO ENCONTRADO: " + vendedor.getNome());
        }
    }

    public void listarVendedores() {
        System.out.println("PLATAFORMA: " + nome);
        for (Vendedor v : vendedores) {
            v.listarProdutos();
        }
    }

    public String getNome() { return nome; }
}