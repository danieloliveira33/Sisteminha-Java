package questao9;

public class Livro {

    String titulo;
    String autor;
    String isbn;
    int paginas;
    boolean disponivel;

    void mostrarDados() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Paginas: " + this.paginas);
    }

    void status() {
        if (this.disponivel) {
            System.out.println("Livro disponivel para emprestimo.");
        } else {
            System.out.println("Livro indisponivel (emprestado).");
        }
    }

    void classificarTamanho() {
        if (this.paginas <= 200) {
            System.out.println("Livro curto (ate 200 paginas).");
        } else if (this.paginas <= 400) {
            System.out.println("Livro medio (201 a 400 paginas).");
        } else {
            System.out.println("Livro longo (mais de 400 paginas).");
        }
    }

}
