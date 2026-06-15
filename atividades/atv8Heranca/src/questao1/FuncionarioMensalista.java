package questao1;

public class FuncionarioMensalista extends Funcionario {

    private double bonus;

    public FuncionarioMensalista(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    public FuncionarioMensalista(String nome, double salarioBase) {
        this(nome, salarioBase, 0);
    }

    @Override
    public double calcularPagamento() {
        return salarioBase + bonus;
    }

}
