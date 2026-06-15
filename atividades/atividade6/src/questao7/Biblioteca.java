package questao7;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("LIVRO CADASTRADO: " + livro.getTitulo() + " | AUTOR: " + livro.getAutor());
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("USUARIO CADASTRADO: " + usuario.getNome() + " | ID: " + usuario.getIdUsuario());
    }

    public void listarEmprestimosAtivos() {
        System.out.println("EMPRESTIMOS ATIVOS NA BIBLIOTECA: " + nome);
        boolean algum = false;
        for (Usuario u : usuarios) {
            if (!u.getEmprestimos().isEmpty()) {
                u.listarEmprestimos();
                algum = true;
            }
        }
        if (!algum) System.out.println("  NENHUM EMPRESTIMO ATIVO.");
    }

    public String getNome() { return nome; }
}