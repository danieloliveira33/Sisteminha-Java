package questao8;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int idPedido;
    private Cliente cliente;
    private List<Item> itens;

    public Pedido(int idPedido, Cliente cliente) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
        System.out.println("ITEM ADICIONADO AO PEDIDO #" + idPedido + ": " + item.getNome() + " | R$ " + item.getPreco());
    }

    public void exibirPedido() {
        double total = 0;
        System.out.println("  PEDIDO #" + idPedido + " | CLIENTE: " + cliente.getNome());
        for (Item i : itens) {
            System.out.println("    ITEM: " + i.getNome() + " | R$ " + i.getPreco());
            total += i.getPreco();
        }
        System.out.println("    TOTAL: R$ " + total);
    }

    public Cliente getCliente() { return cliente; }
    public int getIdPedido() { return idPedido; }
}