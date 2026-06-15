package questao1;

public class Main {
    public static void main (String[] args) {

        FuncionarioHorista geralt   = new FuncionarioHorista("Geralt de Rívia", 160, 45.00);
        FuncionarioMensalista yennefer = new FuncionarioMensalista("Yennefer", 8500, 1200);
        Estagiario ciri = new Estagiario("Ciri", 1500);
        Gerente vesemir = new Gerente("Vesemir", 12000, 3000, 2500);
        FuncionarioHorista jaskier = new FuncionarioHorista("Jaskier", 120, 30.00);

        Empresa escolaKaerMorhen = new Empresa("Escola de Kaer Morhen");
        for (Funcionario f : new Funcionario[]{geralt, yennefer, ciri, vesemir, jaskier})
            escolaKaerMorhen.contratar(f);

        escolaKaerMorhen.folhaDePagamento();
        vesemir.aprovarOrcamento(50000);
        escolaKaerMorhen.demitir("Jaskier");
        escolaKaerMorhen.folhaDePagamento();

    }
}
