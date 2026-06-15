package questao6;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private String nome;
    private List<Veiculo> veiculos;

    public Concessionaria(String nome) {
        this.nome = nome;
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("VEICULO ADICIONADO A CONCESSIONARIA " + nome + ": " + veiculo.getMarca() + " " + veiculo.getModelo());
    }

    public void removerVeiculo(Veiculo veiculo) {
        if (veiculos.remove(veiculo)) {
            System.out.println("VEICULO VENDIDO/REMOVIDO: " + veiculo.getMarca() + " " + veiculo.getModelo());
        } else {
            System.out.println("VEICULO NAO ENCONTRADO: " + veiculo.getModelo());
        }
    }

    public void listarVeiculos() {
        System.out.println("CONCESSIONARIA: " + nome);
        if (veiculos.isEmpty()) {
            System.out.println("  NENHUM VEICULO NO ESTOQUE.");
        } else {
            for (Veiculo v : veiculos) {
                v.exibirVeiculo();
            }
        }
    }

    public String getNome() { return nome; }
}