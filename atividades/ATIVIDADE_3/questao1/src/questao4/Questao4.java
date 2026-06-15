package questao4;

public class Questao4 {
    public static void main (String[] args) {

        Estudante e1 = new Estudante();
        Estudante e2 = new Estudante();

        System.out.println("=============| Estudante 1 |=============");

        e1.nome = "Carlos Silva";
        e1.matricula = "2024001";
        e1.curso = "Ciencia da Computacao";
        e1.periodo = 3;
        e1.ativo = true;

        System.out.println("-----------Dados-----------");
        e1.mostrarDados();
        System.out.println("\n-----------Status-----------");
        e1.status();
        System.out.println("\n-----------Situacao-----------");
        e1.situacao(7.5, 4.0);

        System.out.println("\n\n=============| Estudante 2 |=============");

        e2.nome = "Ana Paula";
        e2.matricula = "2024002";
        e2.curso = "Sistemas de Informacao";
        e2.periodo = 1;
        e2.ativo = false;

        System.out.println("-----------Dados-----------");
        e2.mostrarDados();
        System.out.println("\n-----------Status-----------");
        e2.status();
        System.out.println("\n-----------Situacao-----------");
        e2.situacao(3.5, 10.0);

    }
}
