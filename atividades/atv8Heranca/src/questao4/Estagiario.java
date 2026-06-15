package questao4;

public class Estagiario extends Funcionario{

    private String curso;

    public Estagiario(String nome, int idade, String cpf,
                        String matricula, double bolsa, String curso) {
        super(nome, idade, cpf, matricula, bolsa);
        this.curso = curso;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " (Estagiário/" + curso + ") está aprendendo na prática.");
    }

    public void renovarContrato(int meses) {
        System.out.println("Contrato de " + nome + " renovado por mais " + meses + " meses.");
    }

}
