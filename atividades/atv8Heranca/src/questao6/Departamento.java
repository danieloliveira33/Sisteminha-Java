package questao6;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private String nome;
    private List<Medico> medicos = new ArrayList<>();

    public Departamento(String nome) { this.nome = nome; }

    public void adicionarMedico(Medico m) {
        medicos.add(m);
        System.out.println("Dr(a). " + m.getNome() + " adicionado(a) ao departamento " + nome + ".");
    }

    public void removerMedico(String crm) {
        medicos.removeIf(m -> {
            if (m.getCrm().equals(crm)) {
                System.out.println("Dr(a). " + m.getNome() + " removido(a) do departamento " + nome + ".");
                return true;
            }
            return false;
        });
    }

    public void listarMedicos() {
        System.out.println("\n  Departamento: " + nome + " (" + medicos.size() + " médico(s))");
        for (Medico m : medicos) System.out.println("    " + m);
    }

    public String getNome() { return nome; }

}
