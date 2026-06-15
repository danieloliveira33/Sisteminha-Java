package questao6;

public abstract class Medico extends Pessoa {

    protected String crm;
    protected String especialidade;
    protected double salario;
    protected int pacientesAtendidos;

    public Medico(String nome, int idade, String crm, String especialidade, double salario) {
        super(nome, idade);
        this.crm = crm;
        this.especialidade = especialidade;
        this.salario = salario;
        this.pacientesAtendidos = 0;
    }

    public void atender(String paciente) {
        pacientesAtendidos++;
        System.out.println("Dr(a). " + nome + " (" + especialidade + ") atendendo " + paciente + ".");
    }

    public void emitirLaudo(String paciente, String laudo) {
        System.out.println("Laudo de " + nome + " para " + paciente + ": " + laudo);
    }

    public String getCrm() { return crm; }

    @Override
    public String toString() {
        return "Dr(a). " + nome + " | " + especialidade +
                " | CRM: " + crm + " | Atendimentos: " + pacientesAtendidos;
    }
}
