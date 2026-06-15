package questao6;

public class ClinicoGeral extends Medico {

    public ClinicoGeral(String nome, int idade, String crm, double salario) {
        super(nome, idade, crm, "Clínica Geral", salario);
    }

    public void triagem(String paciente) {
        System.out.println("Dr(a). " + nome + " realizando triagem de " + paciente + ".");
    }

    public void encaminhar(String paciente, String especialidade) {
        System.out.println("Dr(a). " + nome + " encaminhou " + paciente + " para " + especialidade + ".");
    }

}
