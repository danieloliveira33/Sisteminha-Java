package questao9;

public class Professor {
    private String nome;
    private String titulacao;
    private int idProfessor;

    public Professor(String nome, String titulacao, int idProfessor) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.idProfessor = idProfessor;
    }

    public String getNome() { return nome; }
    public String getTitulacao() { return titulacao; }
    public int getIdProfessor() { return idProfessor; }
}