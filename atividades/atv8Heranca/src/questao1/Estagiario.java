package questao1;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double bolsa) {
        super(nome, bolsa);
    }

    @Override
    public double calcularPagamento() {
        return salarioBase;
    }

}
