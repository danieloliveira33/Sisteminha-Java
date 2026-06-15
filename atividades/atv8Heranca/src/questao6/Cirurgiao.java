package questao6;

public class Cirurgiao extends Medico{

    private String tipoCirurgia;
    private int cirurgiasRealizadas;

    public Cirurgiao(String nome, int idade, String crm, double salario, String tipoCirurgia) {
        super(nome, idade, crm, "Cirurgia", salario);
        this.tipoCirurgia = tipoCirurgia;
        this.cirurgiasRealizadas = 0;
    }

    public void realizarCirurgia(String paciente) {
        cirurgiasRealizadas++;
        System.out.println("Dr(a). " + nome + " realizando " + tipoCirurgia +
                " em " + paciente + ". (Total: " + cirurgiasRealizadas + ")");
    }

    @Override
    public String toString() {
        return super.toString() + " | Cirurgias: " + cirurgiasRealizadas;
    }

}
