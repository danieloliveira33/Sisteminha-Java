package questao6;

public class Main {
    public static void main(String[] args) {

        Acessorio a1 = new Acessorio("Ar-Condicionado", 3500.00);
        Acessorio a2 = new Acessorio("GPS", 1200.00);
        Acessorio a3 = new Acessorio("Bau Traseiro", 800.00);

        Carro v1 = new Carro("Toyota", "Corolla", 2024, 145000.00, 4);
        Moto v2 = new Moto("Honda", "CB 500F", 2023, 38000.00, "500cc");

        v1.adicionarAcessorio(a1);
        v1.adicionarAcessorio(a2);
        v2.adicionarAcessorio(a3);

        Concessionaria e1 = new Concessionaria("Coveima");
        e1.adicionarVeiculo(v1);
        e1.adicionarVeiculo(v2);

        System.out.println("---");
        e1.listarVeiculos();

        System.out.println("---");
        v1.removerAcessorio(a2);
        e1.listarVeiculos();
    }
}