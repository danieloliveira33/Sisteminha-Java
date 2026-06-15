package questao5;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nome;
    private String cnpj;
    private List<Departamento> departamentos;

    public Hospital(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.departamentos = new ArrayList<>();
    }

    public void adicionarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
        System.out.println("DEPARTAMENTO ADICIONADO AO HOSPITAL " + nome + ": " + departamento.getNome());
    }

    public void removerDepartamento(Departamento departamento) {
        if (departamentos.remove(departamento)) {
            System.out.println("DEPARTAMENTO REMOVIDO: " + departamento.getNome());
        } else {
            System.out.println("DEPARTAMENTO NAO ENCONTRADO: " + departamento.getNome());
        }
    }

    public void listarDepartamentos() {
        System.out.println("HOSPITAL: " + nome + " | CNPJ: " + cnpj);
        if (departamentos.isEmpty()) {
            System.out.println("  NENHUM DEPARTAMENTO CADASTRADO.");
        } else {
            for (Departamento d : departamentos) {
                d.listarMedicos();
            }
        }
    }

    public String getNome() { return nome; }
}
