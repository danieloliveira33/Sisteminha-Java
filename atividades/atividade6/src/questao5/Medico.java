package questao5;

public class Medico {
    private String nome;
    private String especialidade;
    private int crm;

    public Medico(String nome, String especialidade, int crm) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public void atenderPaciente(Paciente paciente) {
        System.out.println("DR(A). " + nome + " (" + especialidade + ") ATENDENDO PACIENTE: " + paciente.getNome() + " | ID: " + paciente.getIdPaciente());
    }

    public String getNome() { return nome; }
    public String getEspecialidade() { return especialidade; }
    public int getCrm() { return crm; }
}
