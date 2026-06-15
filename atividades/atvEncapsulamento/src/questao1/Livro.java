package questao1;

public class Livro {

    private String titulo;
    private String autor;
    private String editora;
    private int nPaginas;
    private double preco;


    public Livro(String titulo, String autor, String editora, int nPaginas, double preco) {
        if (preco > 0 && nPaginas > 0) {
            this.titulo = titulo;
            this.autor = autor;
            this.editora = editora;
            this.nPaginas = nPaginas;
            this.preco = preco;
        } else
            System.out.println("DADOS INVÁLIDOS");
    }

    public void getDados() {
        System.out.println("TITULO: " + this.titulo);
        System.out.println("AUTOR: " + this.autor);
        System.out.println("EDITORA: " + this.editora);
        System.out.println("NÚMERO DE PÁGINAS: " + this.nPaginas);
        System.out.println("PREÇO: " + this.preco);
    }

    public void setAlterarPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
        }else
            System.out.println("VALOR INVÁLIDO, ALTERAÇÃO NEGADA");
    }
}
