package questao10;

public class Main {
    public static void main(String[] args) {

        Produto pr1 = new Produto("Notebook Gamer", 7500.00, 10);
        Produto pr2 = new Produto("Mouse Sem Fio", 250.00, 50);
        Produto pr3 = new Produto("Teclado Mecanico", 450.00, 30);

        Vendedor v1 = new Vendedor("TechStore", 1);
        Vendedor v2 = new Vendedor("GamerShop", 2);

        v1.adicionarProduto(pr1);
        v1.adicionarProduto(pr2);
        v2.adicionarProduto(pr3);

        Cliente c1 = new Cliente("Daniel", 101);
        Cliente c2 = new Cliente("Carla", 102);

        Ecommerce e1 = new Ecommerce("MercadoTech");
        e1.adicionarVendedor(v1);
        e1.adicionarVendedor(v2);

        System.out.println("---");
        c1.comprar(pr1, 1);
        c1.comprar(pr2, 2);
        c2.comprar(pr3, 1);
        c2.comprar(pr1, 15); // estoque insuficiente

        System.out.println("---");
        e1.listarVendedores();

        System.out.println("---");
        c1.listarCompras();
        c2.listarCompras();
    }
}