package questao1;

public class FuncionarioHorista extends Funcionario {

    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(String nome, int horasTrabalhadas, double valorHora) {
        super(nome, 0);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }

}
