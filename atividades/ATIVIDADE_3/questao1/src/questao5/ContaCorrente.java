package questao5;

public class ContaCorrente {

    String titular;
    String numeroConta;
    double saldo;

    void mostrarDados() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Numero da Conta: " + this.numeroConta);
        System.out.println("Saldo: R$ " + this.saldo);
    }

    void verificarSaldo() {
        if (this.saldo >= 0) {
            System.out.println("Conta em dia. Saldo positivo.");
        } else {
            System.out.println("ATENCAO: Conta com saldo negativo! Regularize sua situacao.");
        }
    }

}
