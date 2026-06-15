package questao7;

import java.util.ArrayList;
import java.util.List;

public abstract class Veiculo {

    protected String marca;
    protected String modelo;
    protected int ano;
    protected double preco;
    private List<Acessorio> acessorios = new ArrayList<>();

    public Veiculo(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public abstract void exibirTipo();

    public void adicionarAcessorio(Acessorio a) {
        acessorios.add(a);
        System.out.println("Acessório '" + a.getNome() + "' adicionado em " + modelo + ".");
    }

    public void removerAcessorio(String nome) {
        acessorios.removeIf(a -> {
            if (a.getNome().equals(nome)) {
                System.out.println("Acessório '" + nome + "' removido de " + modelo + ".");
                return true;
            }
            return false;
        });
    }

    public void exibirComAcessorios() {
        exibirTipo();
        if (acessorios.isEmpty()) {
            System.out.println("  Sem acessórios.");
        } else {
            System.out.println("  Acessórios:");
            double totalAcess = 0;
            for (Acessorio a : acessorios) {
                System.out.println("    - " + a);
                totalAcess += a.getPreco();
            }
            System.out.printf("  Preço total (veículo + acessórios): R$ %.2f%n", preco + totalAcess);
        }
    }

    public String getModelo() { return modelo; }

}
