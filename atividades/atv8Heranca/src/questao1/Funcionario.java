package questao1;

public abstract class Funcionario {

    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularPagamento();

    public void exibirPagamento() {
        System.out.printf("[%s] %s receberá: R$ %.2f%n",
                getClass().getSimpleName(), nome, calcularPagamento());
    }

    public String getNome() { return nome; }

}
