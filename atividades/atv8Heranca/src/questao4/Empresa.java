package questao4;

import java.util.ArrayList;
import java.util.List;


public class Empresa {

    private String nome;
    private String cnpj;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void contratar(Funcionario f) {
        funcionarios.add(f);
        System.out.println("[Contratado] " + f.getNome() + " ingressou em " + nome + ".");
    }

    public void demitir(String matricula) {
        funcionarios.removeIf(f -> {
            if (f.getMatricula().equals(matricula)) {
                f.ativo = false;
                System.out.println("[Demitido] " + f.getNome() + " (matrícula " + matricula + ") saiu.");
                return true;
            }
            return false;
        });
    }

    public void listarFuncionarios() {
        System.out.println("\n=== Funcionários de " + nome + " ===");
        for (Funcionario f : funcionarios) System.out.println("  " + f);
    }

    public void pagarFolha() {
        System.out.println("\n=== Pagamento de Folha — " + nome + " ===");
        for (Funcionario f : funcionarios) f.receberSalario();
    }

}
