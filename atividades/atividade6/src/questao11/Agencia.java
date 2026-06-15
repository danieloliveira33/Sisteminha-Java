package questao11;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nome;
    private List<Pacote> pacotes;

    public Agencia(String nome) {
        this.nome = nome;
        this.pacotes = new ArrayList<>();
    }

    public void adicionarPacote(Pacote pacote) {
        pacotes.add(pacote);
        System.out.println("PACOTE CRIADO NA AGENCIA " + nome + ": " + pacote.getNome());
    }

    public void removerPacote(Pacote pacote) {
        if (pacotes.remove(pacote)) {
            System.out.println("PACOTE REMOVIDO: " + pacote.getNome());
        } else {
            System.out.println("PACOTE NAO ENCONTRADO: " + pacote.getNome());
        }
    }

    public void listarPacotes() {
        System.out.println("AGENCIA: " + nome);
        if (pacotes.isEmpty()) {
            System.out.println("  NENHUM PACOTE DISPONIVEL.");
        } else {
            for (Pacote p : pacotes) {
                p.listarPacote();
            }
        }
    }

    public String getNome() { return nome; }
}