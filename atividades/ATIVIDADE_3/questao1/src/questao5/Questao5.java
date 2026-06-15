package questao5;

public class Questao5 {
    public static void main (String[] args) {

        ContaCorrente cc1 = new ContaCorrente();
        ContaCorrente cc2 = new ContaCorrente();

        System.out.println("=============| Conta Corrente 1 |=============");

        cc1.titular = "Roberto Alves";
        cc1.numeroConta = "12345-6";
        cc1.saldo = 1500.00;

        cc1.mostrarDados();
        System.out.println();
        cc1.verificarSaldo();

        System.out.println("\n=============| Conta Corrente 2 |=============");

        cc2.titular = "Fernanda Costa";
        cc2.numeroConta = "98765-4";
        cc2.saldo = -200.00;

        cc2.mostrarDados();
        System.out.println();
        cc2.verificarSaldo();

    }
}
