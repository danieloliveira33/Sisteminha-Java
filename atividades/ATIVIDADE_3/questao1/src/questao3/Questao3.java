package questao3;

import java.util.Scanner;

public class Questao3 {

    static int verifica = -10;
    static boolean saida = false;

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        f1.nome = "Junior Vianna";
        f1.departamento = "educacao";
        f1.contrato = "contratado";
        f1.idade = 25;
        f1.salario = 2.99;
        f1.numerocontrato = 3281371;
        f1.cargo = "professor";

        f2.nome = "Jodiscleiton";
        f2.departamento = "infraestrutura";
        f2.contrato = "contratado";
        f2.idade = 25;
        f2.salario = 2.99;
        f2.numerocontrato = 3281371;
        f2.cargo = "mestre de obras";

        System.out.println("===============| FUNCIONARIO 1 |===============");
        f1.dados();
        do {
            System.out.println("--------------------------------------------");
            System.out.println("DESEJA ALTERAR STATUS DE CONTRATO DO FUNCIONARIO 1?");
            System.out.println("DIGITE: 1 - SIM | 0 - NAO");
            verifica = scanner.nextInt();
            if (verifica == 0 ) {
                break;
            } else if (verifica == 1) {
                f1.preencherContrato();
                break;
            }
        }while(true);
        f1.status();
        System.out.println("===============================================");

        System.out.println("\n");
        System.out.println("===============| FUNCIONARIO 2 |===============");
        f1.dados();
        do {
            System.out.println("--------------------------------------------");
            System.out.println("DESEJA ALTERAR STATUS DE CONTRATO (FUNCIONARIO 2)?");
            System.out.println("DIGITE: 1 - SIM | 0 - NAO");
            verifica = scanner.nextInt();
            if (verifica == 0 ) {
                break;
            } else if (verifica == 1) {
                f1.preencherContrato();
                break;
            }
        }while(true);
        f1.status();
        System.out.println("===============================================");

    }
}
