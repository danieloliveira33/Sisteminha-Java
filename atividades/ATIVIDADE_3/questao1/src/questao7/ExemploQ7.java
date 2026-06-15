package questao7;

public class ExemploQ7 {

    String nome;
    int valor;

    void exibir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Valor: " + this.valor);
    }

    void dobrarValor() {
        System.out.println("Dobro do valor: " + (this.valor * 2));
    }
}
