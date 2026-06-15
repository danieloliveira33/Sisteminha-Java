package questao1;

public class Gerente extends Funcionario {

    private double bonus;
    private double participacaoLucros;

    public Gerente(String nome, double salarioBase, double bonus, double participacaoLucros) {
        super(nome, salarioBase);
        this.bonus = bonus;
        this.participacaoLucros = participacaoLucros;
    }

    @Override
    public double calcularPagamento() {
        return salarioBase + bonus + participacaoLucros;
    }

    public void aprovarOrcamento(double valor) {
        System.out.printf("Gerente %s aprovou orçamento de R$ %.2f%n", nome, valor);
    }

}
