package questao2;

import java.util.ArrayList;
import java.util.List;

public class Exposicao {
    private String nome;
    private String tema;
    private List<ObraDeArte> obras;

    public Exposicao(String nome, String tema) {
        this.nome = nome;
        this.tema = tema;
        this.obras = new ArrayList<>();
    }

    public void adicionarObra(ObraDeArte obra) {
        obras.add(obra);
        System.out.println("OBRA ADICIONADA: " + obra.getTitulo() + " | ARTISTA: " + obra.getArtista() + " | ANO: " + obra.getAnoDeProducao());
    }

    public void removerObra(ObraDeArte obra) {
        if (obras.remove(obra)) {
            System.out.println("OBRA REMOVIDA: " + obra.getTitulo() + " (EMPRESTADA OU VENDIDA)");
        } else {
            System.out.println("OBRA NAO ENCONTRADA NA EXPOSICAO: " + obra.getTitulo());
        }
    }

    public void listarObras() {
        System.out.println("  EXPOSICAO: " + nome + " | TEMA: " + tema);
        if (obras.isEmpty()) {
            System.out.println("    NENHUMA OBRA NESTA EXPOSICAO.");
        } else {
            for (ObraDeArte o : obras) {
                System.out.println("    OBRA: " + o.getTitulo() + " | ARTISTA: " + o.getArtista() + " | ANO: " + o.getAnoDeProducao());
            }
        }
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTema() { return tema; }
    public void setTema(String tema) { this.tema = tema; }
}
