package questao4;

public class Gerente extends Funcionario{

    private String departamento;
    private double bonus;

    public Gerente(String nome, int idade, String cpf, String matricula,
                     double salario, String departamento, double bonus) {
        super(nome, idade, cpf, matricula, salario);
        this.departamento = departamento;
        this.bonus = bonus;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " (Gerente/" + departamento + ") está liderando a equipe.");
    }

    @Override
    public void receberSalario() {
        System.out.printf("%s (Gerente) recebeu R$ %.2f (salário + bônus).%n", nome, salario + bonus);
    }

    public void concederBonus(Funcionario funcionario) {
        System.out.println(nome + " concedeu bônus de R$ 500,00 a " + funcionario.getNome() + ".");
    }

}
