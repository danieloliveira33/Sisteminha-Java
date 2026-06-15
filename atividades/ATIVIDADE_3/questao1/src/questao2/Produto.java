package questao2;

public class Produto {

    String nome;
    double preco;
    int qtdEstoque;
    int codigo;
    boolean status;

    void mostrarQtd () {
        if (qtdEstoque >= 0)
            System.out.println("QUANTIDADE: " + this.qtdEstoque);
        else
            System.out.println("Instancie direito, incopetente!");
    }

    void status() {
        if (status == true && qtdEstoque > 0) {
            System.out.println("Produto disponível");
        }else
            System.out.println("Produto indisponível");
    }

    void dados() {
        System.out.println("NOME: " + nome);
        System.out.println("PRECO: " + preco);
        System.out.println("CODIGO: " + codigo);
    }

}
