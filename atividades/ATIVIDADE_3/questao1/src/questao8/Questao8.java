package questao8;

public class Questao8 {
    public static void main (String[] args) {

        /*
         * QUESTAO 8 - Possibilidade da classe Consulta
         *
         * A propria Consulta pode ser uma classe sim.
         * Em vez de tratar a consulta apenas como uma acao do medico ou do paciente,
         * ela pode ser um objeto independente com seus proprios atributos e metodos.
         *
         * Exemplo de atributos de Consulta: paciente, medico, data, diagnostico, receita
         * Exemplo de metodos de Consulta: iniciar(), encerrar(), emitirReceita()
         *
         * Isso faz sentido pois uma consulta tem seu proprio ciclo,
         * ela existe, tem dados proprios e pode ser armazenada, consultada e alterada
         * de forma independente do paciente ou do medico.
         */

        Paciente p1 = new Paciente();
        Medico m1 = new Medico();

        p1.nome = "Joao da Silva";
        p1.idade = 45;
        p1.tipoSanguineo = "O+";

        m1.nome = "Dra. Camila Torres";
        m1.crm = "CRM-SP 123456";
        m1.especialidade = "Clinica Geral";

        System.out.println("=============| Paciente |=============");
        p1.mostrarDados();
        System.out.println();
        p1.historico();

        System.out.println("\n=============| Medico |=============");
        m1.mostrarDados();
        System.out.println();
        m1.realizarConsulta(p1.nome);

    }
}
