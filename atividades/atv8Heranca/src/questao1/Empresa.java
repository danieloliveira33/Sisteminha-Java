package questao1;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
        private String nome;
        private List<Funcionario> funcionarios = new ArrayList<>();

        public Empresa(String nome) { this.nome = nome; }

        public void contratar(Funcionario f) {
            funcionarios.add(f);
            System.out.println(f.getNome() + " foi contratado(a) em " + nome + ".");
        }

        public void demitir(String nome) {
            funcionarios.removeIf(f -> {
                if (f.getNome().equals(nome)) {
                    System.out.println(nome + " foi demitido(a) de " + this.nome + ".");
                    return true;
                }
                return false;
            });
        }

        public void folhaDePagamento() {
            System.out.println("\n=== Folha de Pagamento — " + nome + " ===");
            double total = 0;
            for (Funcionario f : funcionarios) {
                f.exibirPagamento();
                total += f.calcularPagamento();
            }
            System.out.printf("Total da folha: R$ %.2f%n%n", total);
        }

}
