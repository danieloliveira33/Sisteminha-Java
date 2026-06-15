package questao7;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

    private String nome;
    private List<Veiculo> veiculos = new ArrayList<>();

    public Concessionaria(String nome) { this.nome = nome; }

    public void adicionarVeiculo(Veiculo v) {
        veiculos.add(v);
        System.out.println(v.getModelo() + " adicionado ao estoque de " + nome + ".");
    }

    public void removerVeiculo(String modelo) {
        veiculos.removeIf(v -> {
            if (v.getModelo().equals(modelo)) {
                System.out.println(modelo + " removido do estoque.");
                return true;
            }
            return false;
        });
    }

    public void listarEstoque() {
        System.out.println("\n=== Estoque — " + nome + " ===");
        for (Veiculo v : veiculos) v.exibirComAcessorios();
    }

}
