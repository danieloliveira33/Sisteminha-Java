package questao5;

import java.util.ArrayList;
import java.util.List;

public class Exposicao {

    private String nome;
    private String dataInicio;
    private String dataFim;
    private List<ObraArte> obras = new ArrayList<>();

    public Exposicao(String nome, String dataInicio, String dataFim) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public void adicionarObra(ObraArte obra) {
        obras.add(obra);
        System.out.println("Obra '" + obra.getTitulo() + "' adicionada à exposição '" + nome + "'.");
    }

    public void removerObra(String titulo) {
        obras.removeIf(o -> {
            if (o.getTitulo().equals(titulo)) {
                System.out.println("Obra '" + titulo + "' removida da exposição.");
                return true;
            }
            return false;
        });
    }

    public void listar() {
        System.out.println("\n--- Exposição: " + nome +
                " (" + dataInicio + " a " + dataFim + ") ---");
        System.out.println("  " + obras.size() + " obra(s) em exibição:");
        for (ObraArte o : obras) o.descrever();
    }

    public String getNome() { return nome; }

}
