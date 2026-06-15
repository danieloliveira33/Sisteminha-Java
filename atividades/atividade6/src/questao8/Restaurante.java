package questao8;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nome;
    private List<Pedido> pedidos;

    public Restaurante(String nome) {
        this.nome = nome;
        this.pedidos = new ArrayList<>();
    }

    public Pedido criarPedido(int idPedido, Cliente cliente) {
        Pedido pedido = new Pedido(idPedido, cliente);
        pedidos.add(pedido);
        System.out.println("PEDIDO CRIADO: #" + idPedido + " | CLIENTE: " + cliente.getNome());
        return pedido;
    }

    public void listarPedidosDoCliente(Cliente cliente) {
        System.out.println("PEDIDOS DO CLIENTE: " + cliente.getNome());
        boolean algum = false;
        for (Pedido p : pedidos) {
            if (p.getCliente() == cliente) {
                p.exibirPedido();
                algum = true;
            }
        }
        if (!algum) System.out.println("  NENHUM PEDIDO ENCONTRADO.");
    }

    public String getNome() { return nome; }
}