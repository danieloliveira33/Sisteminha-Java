package questao6;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String nome;
    private List<Departamento> departamentos = new ArrayList<>();

    public Hospital(String nome) { this.nome = nome; }

    public void adicionarDepartamento(Departamento d) {
        departamentos.add(d);
        System.out.println("Departamento '" + d.getNome() + "' adicionado a " + nome + ".");
    }

    public void removerDepartamento(String nome) {
        departamentos.removeIf(d -> {
            if (d.getNome().equals(nome)) {
                System.out.println("Departamento '" + nome + "' removido.");
                return true;
            }
            return false;
        });
    }

    public void listarDepartamentos() {
        System.out.println("\n=== " + nome + " — Estrutura ===");
        for (Departamento d : departamentos) d.listarMedicos();
    }

}
