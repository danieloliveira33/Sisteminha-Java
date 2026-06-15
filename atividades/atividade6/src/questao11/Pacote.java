package questao11;

import java.util.ArrayList;
import java.util.List;

public class Pacote {
    private String nome;
    private double preco;
    private List<Destino> destinos;
    private List<GuiaTuristico> guias;

    public Pacote(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.destinos = new ArrayList<>();
        this.guias = new ArrayList<>();
    }

    public void adicionarDestino(Destino destino) {
        destinos.add(destino);
        System.out.println("DESTINO ADICIONADO AO PACOTE " + nome + ": " + destino.getNome() + " | " + destino.getPais());
    }

    public void adicionarGuia(GuiaTuristico guia) {
        guias.add(guia);
        System.out.println("GUIA ADICIONADO AO PACOTE " + nome + ": " + guia.getNome() + " | IDIOMA: " + guia.getIdioma());
    }

    public void listarPacote() {
        System.out.println("  PACOTE: " + nome + " | R$ " + preco);
        System.out.println("    DESTINOS:");
        if (destinos.isEmpty()) {
            System.out.println("      NENHUM.");
        } else {
            for (Destino d : destinos) {
                System.out.println("      " + d.getNome() + " | " + d.getPais() + " - " + d.getDescricao());
            }
        }
        System.out.println("    GUIAS:");
        if (guias.isEmpty()) {
            System.out.println("      NENHUM.");
        } else {
            for (GuiaTuristico g : guias) {
                System.out.println("      " + g.getNome() + " | IDIOMA: " + g.getIdioma() + " | ID: " + g.getIdGuia());
            }
        }
    }

    public String getNome() { return nome; }
}