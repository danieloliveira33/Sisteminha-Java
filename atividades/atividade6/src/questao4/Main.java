package questao4;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Daniel", 22, "063.748.615-31", "Rua das Flores", 123, "Guanambi", "BA", "46430-000");
        Pessoa p2 = new Pessoa("Carla", 30, "987.654.321-00", "Av. Paulista", 1000, "Sao Paulo", "SP", "01310-100");

        p1.exibirInformacoes();
        System.out.println("---");
        p2.exibirInformacoes();

        System.out.println("---");
        p1.atualizarEndereco("Rua Nova", 456, "Salvador", "BA", "40000-000");
        p1.exibirInformacoes();
    }
}