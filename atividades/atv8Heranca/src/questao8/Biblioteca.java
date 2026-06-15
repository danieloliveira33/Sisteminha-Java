package questao8;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nome;
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca(String nome) { this.nome = nome; }

    public void cadastrarLivro(Livro l) {
        livros.add(l);
        System.out.println("Livro '" + l.getTitulo() + "' cadastrado na biblioteca.");
    }

    public void cadastrarUsuario(Usuario u) {
        usuarios.add(u);
        System.out.println("Usuário " + u.getNome() + " cadastrado na biblioteca.");
    }

    public void emprestarLivro(String isbn, String matricula, String data) {
        Livro livro = livros.stream()
                .filter(l -> l.getIsbn().equals(isbn) && l.isDisponivel())
                .findFirst().orElse(null);
        Usuario usuario = usuarios.stream()
                .filter(u -> u.getMatricula().equals(matricula))
                .findFirst().orElse(null);

        if (livro == null) {
            System.out.println("Livro não encontrado ou indisponível."); return;
        }
        if (usuario == null) {
            System.out.println("Usuário não encontrado."); return;
        }
        if (!usuario.podeEmprestar()) {
            System.out.println(usuario.getNome() + " atingiu o limite de empréstimos."); return;
        }

        livro.setDisponivel(false);
        usuario.receberLivro(livro);
        emprestimos.add(new Emprestimo(livro, usuario, data));
        System.out.println("Empréstimo realizado: " + usuario.getNome() +
                " reservou " + livro.getTitulo());
    }

    public void devolverLivro(String isbn, String matricula) {
        emprestimos.removeIf(e -> {
            if (e.getLivro().getIsbn().equals(isbn) &&
                    e.getUsuario().getMatricula().equals(matricula)) {
                e.getLivro().setDisponivel(true);
                e.getUsuario().devolverLivro(e.getLivro());
                System.out.println(e.getUsuario().getNome() +
                        " devolveu '" + e.getLivro().getTitulo() + "'.");
                return true;
            }
            return false;
        });
    }

    public void listarEmprestimos() {
        System.out.println("\n=== Empréstimos Ativos — " + nome + " ===");
        if (emprestimos.isEmpty()) { System.out.println("  Nenhum empréstimo ativo."); return; }
        for (Emprestimo e : emprestimos) System.out.println("  " + e);
    }

    public void listarAcervo() {
        System.out.println("\n=== Acervo — " + nome + " ===");
        for (Livro l : livros) System.out.println("  " + l);
    }

    public void listarUsuarios() {
        System.out.println("\n=== Usuários — " + nome + " ===");
        for (Usuario u : usuarios) System.out.println("  " + u);
    }

}
