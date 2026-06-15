package questao4;

public class Pessoa {

    protected String nome;
    protected int idade;
    protected String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", " + idade + " anos.");
    }

    public String getNome() { return nome; }

}
