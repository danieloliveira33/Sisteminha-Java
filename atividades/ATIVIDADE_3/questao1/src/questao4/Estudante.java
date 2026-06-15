package questao4;

public class Estudante {

    String nome;
    String matricula;
    String curso;
    int periodo;
    boolean ativo;

    void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
        System.out.println("Periodo: " + this.periodo);
    }

    void status() {
        if (this.ativo == true) {
            System.out.println("Estudante matriculado e ativo");
        } else {
            System.out.println("Estudante inativo ou trancado");
        }
    }

    void situacao(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;
        System.out.println("Nota 1: " + nota1 + " | Nota 2: " + nota2);
        System.out.println("Media: " + media);
        if (media >= 7.0) {
            System.out.println("Situacao: APROVADO");
        } else if (media >= 5.0) {
            System.out.println("Situacao: RECUPERACAO");
        } else {
            System.out.println("Situacao: REPROVADO");
        }
    }

}
