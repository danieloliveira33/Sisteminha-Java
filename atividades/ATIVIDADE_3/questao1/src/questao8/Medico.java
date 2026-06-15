package questao8;

public class Medico {

    String nome;
    String crm;
    String especialidade;

    void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CRM: " + this.crm);
        System.out.println("Especialidade: " + this.especialidade);
    }

    void realizarConsulta(String nomePaciente) {
        System.out.println(this.nome + " esta realizando consulta com o paciente " + nomePaciente + ".");
    }

    void emitirReceita(String medicamento) {
        System.out.println("Receita emitida por " + this.nome + ": " + medicamento);
    }

}
