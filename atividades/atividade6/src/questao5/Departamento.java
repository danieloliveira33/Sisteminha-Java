package questao5;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Medico> medicos;

    public Departamento(String nome) {
        this.nome = nome;
        this.medicos = new ArrayList<>();
    }

    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
        System.out.println("MEDICO ADICIONADO AO DEPTO " + nome + ": DR(A). " + medico.getNome() + " | CRM: " + medico.getCrm());
    }

    public void removerMedico(Medico medico) {
        if (medicos.remove(medico)) {
            System.out.println("MEDICO REMOVIDO DO DEPTO " + nome + ": DR(A). " + medico.getNome());
        } else {
            System.out.println("MEDICO NAO ENCONTRADO NO DEPTO: " + medico.getNome());
        }
    }

    public void listarMedicos() {
        System.out.println("  DEPARTAMENTO: " + nome);
        if (medicos.isEmpty()) {
            System.out.println("    NENHUM MEDICO NESTE DEPARTAMENTO.");
        } else {
            for (Medico m : medicos) {
                System.out.println("    DR(A). " + m.getNome() + " | ESPECIALIDADE: " + m.getEspecialidade() + " | CRM: " + m.getCrm());
            }
        }
    }

    public String getNome() { return nome; }
}
