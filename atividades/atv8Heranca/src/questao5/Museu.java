package questao5;

import java.util.ArrayList;
import java.util.List;

public class Museu {

    private String nome;
    private String cidade;
    private List<Exposicao> exposicoes = new ArrayList<>();

    public Museu(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public void adicionarExposicao(Exposicao e) {
        exposicoes.add(e);
        System.out.println("Exposição '" + e.getNome() + "' aberta em " + nome + ".");
    }

    public void encerrarExposicao(String nome) {
        exposicoes.removeIf(e -> {
            if (e.getNome().equals(nome)) {
                System.out.println("Exposição '" + nome + "' encerrada.");
                return true;
            }
            return false;
        });
    }

    public void listarExposicoes() {
        System.out.println("\n=== " + nome + " — " + cidade + " ===");
        System.out.println("  " + exposicoes.size() + " exposição(ões) ativa(s):");
        for (Exposicao e : exposicoes) e.listar();
    }

}
