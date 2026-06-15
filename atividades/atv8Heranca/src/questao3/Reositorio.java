package questao3;

import java.util.ArrayList;
import java.util.List;

public class Reositorio {

        private String nome;
        private List<Publicacao> publicacoes = new ArrayList<>();

        public Reositorio(String nome) {
            this.nome = nome;
        }

        public void adicionar(Publicacao p) {
            publicacoes.add(p);
            System.out.println("Publicação '" + p.getTitulo() + "' adicionada ao repositório.");
        }

        public void listarTodas() {
            System.out.println("\n=== Repositório: " + nome + " (" + publicacoes.size() + " itens) ===");
            for (Publicacao p : publicacoes) p.exibirDetalhes();
        }

        public void buscarPorAutor(String autor) {
            System.out.println("\nBusca por autor '" + autor + "':");
            boolean achou = false;
            for (Publicacao p : publicacoes) {
                if (p.getAutor().toLowerCase().contains(autor.toLowerCase())) {
                    System.out.println("  - " + p.getTitulo() + " (" + p.citar() + ")");
                    achou = true;
                }
            }
            if (!achou) System.out.println("  Nenhum resultado.");
        }

        public void gerarReferencias() {
            System.out.println("\n=== Referências ===");
            for (Publicacao p : publicacoes) System.out.println("  " + p.citar());
        }
}
