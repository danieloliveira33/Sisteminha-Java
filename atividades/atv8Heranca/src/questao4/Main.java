package questao4;

public class Main {
    public static void main (String[] args) {

        Gerente dumbledore = new Gerente("Albus Dumbledore",   150, "222.222.222-22", "G002", 20000, "Diretoria", 5000);
        FuncionarioAdministrativo hermione = new FuncionarioAdministrativo("Hermione Granger", 24, "333.333.333-33", "A001", 8000, "Ministeriado");
        FuncionarioAdministrativo rony     = new FuncionarioAdministrativo("Rony Weasley",     24, "444.444.444-44", "A002", 7500, "Auror");
        Estagiario harry   = new Estagiario("Harry Potter",        21, "777.777.777-77", "E001", 2000, "Auror");

        Empresa ministerio = new Empresa("Ministério da Magia", "00.000.000/0001-00");
        ministerio.contratar(dumbledore);
        ministerio.contratar(hermione);
        ministerio.contratar(rony);
        ministerio.contratar(harry);

        ministerio.listarFuncionarios();
        ministerio.pagarFolha();
        dumbledore.concederBonus(hermione);
        hermione.emitirRelatorio();
        harry.renovarContrato(6);
        ministerio.demitir("E002");
        ministerio.listarFuncionarios();

    }
}
