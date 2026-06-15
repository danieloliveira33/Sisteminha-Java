package questao7;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private int idUsuario;
    private List<Emprestimo> emprestimos;

    public Usuario(String nome, int idUsuario) {
        this.nome = nome;
        this.idUsuario = idUsuario;
        this.emprestimos = new ArrayList<>();
    }

    public void pegarEmprestado(Livro livro, String data) {
        if (livro.isDisponivel()) {
            emprestimos.add(new Emprestimo(livro, data));
            livro.setDisponivel(false);
            System.out.println("EMPRESTIMO REALIZADO: " + nome + " pegou '" + livro.getTitulo() + "' em " + data);
        } else {
            System.out.println("LIVRO INDISPONIVEL: " + livro.getTitulo());
        }
    }

    public void devolver(Livro livro) {
        Emprestimo encontrado = null;
        for (Emprestimo e : emprestimos) {
            if (e.getLivro() == livro) {
                encontrado = e;
                break;
            }
        }
        if (encontrado != null) {
            emprestimos.remove(encontrado);
            livro.setDisponivel(true);
            System.out.println("DEVOLUCAO: " + nome + " devolveu '" + livro.getTitulo() + "'");
        } else {
            System.out.println("ESTE USUARIO NAO POSSUI O LIVRO: " + livro.getTitulo());
        }
    }

    public void listarEmprestimos() {
        System.out.println("  USUARIO: " + nome + " | ID: " + idUsuario);
        if (emprestimos.isEmpty()) {
            System.out.println("    NENHUM LIVRO EMPRESTADO.");
        } else {
            for (Emprestimo e : emprestimos) {
                System.out.println("    LIVRO: " + e.getLivro().getTitulo() + " | DESDE: " + e.getDataEmprestimo());
            }
        }
    }

    public String getNome() { return nome; }
    public int getIdUsuario() { return idUsuario; }
    public List<Emprestimo> getEmprestimos() { return emprestimos; }
}