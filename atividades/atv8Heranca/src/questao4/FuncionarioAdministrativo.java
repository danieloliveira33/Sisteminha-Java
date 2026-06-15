package questao4;

public class FuncionarioAdministrativo extends Funcionario {

    private String setor;

    public FuncionarioAdministrativo(String nome, int idade, String cpf,
                                     String matricula, double salario, String setor) {
        super(nome, idade, cpf, matricula, salario);
        this.setor = setor;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " (Administrativo/" + setor + ") está organizando documentos.");
    }

    public void emitirRelatorio() {
        System.out.println(nome + " emitiu relatório do setor " + setor + ".");
    }

}
