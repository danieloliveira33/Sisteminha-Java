package questao6;

public class Pediatra extends Medico{

    private int idadeMaximaPaciente;

    public Pediatra(String nome, int idade, String crm, double salario, int idadeMaximaPaciente) {
        super(nome, idade, crm, "Pediatria", salario);
        this.idadeMaximaPaciente = idadeMaximaPaciente;
    }

    public void atenderCrianca(String crianca, int idadeCrianca) {
        if (idadeCrianca <= idadeMaximaPaciente) {
            pacientesAtendidos++;
            System.out.println("Dr. " + nome + " atendendo " + crianca + " de " + idadeCrianca + " anos).");
        } else {
            System.out.println(crianca + " deve se encaminhar a clínico geral.");
        }
    }

}
