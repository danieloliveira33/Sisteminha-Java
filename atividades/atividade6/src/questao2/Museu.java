package questao2;

import java.util.ArrayList;
import java.util.List;

public class Museu {
    private String nome;
    private String cidade;
    private List<Exposicao> exposicoes;

    public Museu(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.exposicoes = new ArrayList<>();
    }

    public void adicionarExposicao(Exposicao exposicao) {
        exposicoes.add(exposicao);
        System.out.println("EXPOSICAO ADICIONADA AO MUSEU " + nome + ": " + exposicao.getNome());
    }

    public void removerExposicao(Exposicao exposicao) {
        if (exposicoes.remove(exposicao)) {
            System.out.println("EXPOSICAO ENCERRADA: " + exposicao.getNome());
        } else {
            System.out.println("EXPOSICAO NAO ENCONTRADA: " + exposicao.getNome());
        }
    }

    public void listarExposicoes() {
        System.out.println("MUSEU: " + nome + " | CIDADE: " + cidade);
        if (exposicoes.isEmpty()) {
            System.out.println("  NENHUMA EXPOSICAO NO MOMENTO.");
        } else {
            for (Exposicao e : exposicoes) {
                e.listarObras();
            }
        }
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }
}
