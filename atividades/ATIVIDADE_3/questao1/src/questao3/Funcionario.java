package questao3;
import java.util.Scanner;

public class Funcionario {

    String nome;
    String departamento;
    String cargo;
    int numerocontrato;
    double salario;
    int idade;
    String contrato;

    void dados () {
        System.out.println("---------- DADOS -----------");
        System.out.println("NOME: " + nome);
        System.out.println("DEPARTAMENTO: " + departamento);
        System.out.println("NUMERO DO CONTRATO: " + numerocontrato);
        System.out.println("SALARIO: " + salario);
        System.out.println("IDADE: " + idade);
        System.out.println("STATUS CONTRATO: " + contrato);
        System.out.println("CARGO: " + cargo);
    }

    void status() {
        System.out.println("---------- STATUS DO CONTRATO -----------");
        System.out.println("STATUS DO CONTRATO: " + contrato);
    }

    void preencherContrato () {
        boolean condicao = false;
        Scanner scanner = new Scanner(System.in);
        int scan = 0;
        do {
            System.out.println("---------- PREENCHER CONTRATO -----------");
            System.out.println("DIGITE ___ PARA:");
            System.out.println("1 - CONTRATADO | 2  - DISPENSADO");
            scan = scanner.nextInt();
            if (scan == 1) {
                this.contrato = "CONTRATADO";
                condicao = true;
            } else if (scan == 2) {
                this.contrato = "DISPENSADO";
                condicao = true;
            }

        }while (!condicao);
    }
}
