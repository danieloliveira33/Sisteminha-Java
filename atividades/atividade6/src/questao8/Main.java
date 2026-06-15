package questao8;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Daniel", 1);
        Cliente c2 = new Cliente("Carla", 2);

        Restaurante r1 = new Restaurante("Restaurante do Zeca");

        Pedido pe1 = r1.criarPedido(101, c1);
        pe1.adicionarItem(new Item("Pizza Margherita", 45.00));
        pe1.adicionarItem(new Item("Suco de Laranja", 12.00));

        Pedido pe2 = r1.criarPedido(102, c2);
        pe2.adicionarItem(new Item("Hamburguer Duplo", 38.00));

        Pedido pe3 = r1.criarPedido(103, c1);
        pe3.adicionarItem(new Item("Pasta Carbonara", 52.00));
        pe3.adicionarItem(new Item("Agua Mineral", 6.00));

        System.out.println("---");
        r1.listarPedidosDoCliente(c1);
        System.out.println("---");
        r1.listarPedidosDoCliente(c2);
    }
}