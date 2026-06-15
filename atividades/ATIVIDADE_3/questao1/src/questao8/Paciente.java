package questao8;

public class Paciente {

    String nome;
    int idade;
    String tipoSanguineo;

    void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Tipo Sanguineo: " + this.tipoSanguineo);
    }

    void historico() {
        System.out.println("Historico de " + this.nome + ": nenhuma consulta anterior registrada.");
    }

    void verificarIdade() {
        if (this.idade >= 60) {
            System.out.println(this.nome + " e idoso. Atendimento prioritario.");
        } else {
            System.out.println(this.nome + " nao tem prioridade por idade.");
        }
    }

}
