package questao1;

public class Main {
    public static void main (String[] args) {

        Funcionario f1 = new Funcionario("Daniel", "063.748.615-31", 76234273);
        Funcionario f2 = new Funcionario("Carlúcio", "678.287,926-44", 111111);

        Empresa e1 = new Empresa("Pirelli", "726676382738-98");
        Empresa e2 = new Empresa("Bridgestone", "874837289-88");

        e1.contratar(f1);
        e1.contratar(f2);
        e1.listarFuncionarios();
        e1.demitir(f1);
        e1.listarFuncionarios();
    }
}
