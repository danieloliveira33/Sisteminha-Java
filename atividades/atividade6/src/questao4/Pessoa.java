package questao4;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private Endereco endereco;

    public Pessoa(String nome, int idade, String cpf,
                  String rua, int numero, String cidade, String estado, String cep) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = new Endereco(rua, numero, cidade, estado, cep);
    }

    public void exibirInformacoes() {
        System.out.println("PESSOA: " + nome + " | IDADE: " + idade + " | CPF: " + cpf);
        System.out.println("  ENDERECO: " + endereco.getRua() + ", " + endereco.getNumero()
                + " | CIDADE: " + endereco.getCidade()
                + " | ESTADO: " + endereco.getEstado()
                + " | CEP: " + endereco.getCep());
    }

    public void atualizarEndereco(String rua, int numero, String cidade, String estado, String cep) {
        this.endereco = new Endereco(rua, numero, cidade, estado, cep);
        System.out.println("ENDERECO ATUALIZADO PARA: " + rua + ", " + numero + " - " + cidade);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
}
