package questao4;

public abstract class Funcionario extends Pessoa{

    protected String matricula;
    protected double salario;
    protected boolean ativo;

    public Funcionario(String nome, int idade, String cpf, String matricula, double salario) {
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.salario = salario;
        this.ativo = true;
    }

    public abstract void trabalhar();

    public void receberSalario() {
        System.out.printf("%s recebeu R$ %.2f.%n", nome, salario);
    }

    public String getMatricula() { return matricula; }

    @Override
    public String toString() {
        return nome + " | Matrícula: " + matricula +
                " | Salário: R$ " + String.format("%.2f", salario) +
                " | " + (ativo ? "Ativo" : "Inativo");
    }

}
