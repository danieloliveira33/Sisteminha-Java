package questao10;

public class Q10Estudantes {

    String[] nomes = new String[10];
    String[] matriculas = new String[10];
    int total = 0;

    void inserir(String nome, String matricula) {

        if (total < 10) {
            nomes[total]      = nome;
            matriculas[total] = matricula;
            total++;
            System.out.println("Estudante inserido: " + nome + " | Matricula: " + matricula);
        } else {
            System.out.println("Cadastro cheio! Nao foi possivel inserir " + nome);
        }
    }

    void excluir(String matricula) {

        for (int i = 0; i < total; i++) {
            if (matriculas[i].equals(matricula)) {
                System.out.println("Excluindo: " + nomes[i] + " | Matricula: " + matriculas[i]);
                // desloca os elementos para cobrir o espaco removido
                for (int j = i; j < total - 1; j++) {
                    nomes[j]      = nomes[j + 1];
                    matriculas[j] = matriculas[j + 1];
                }
                nomes[total - 1]      = null;
                matriculas[total - 1] = null;
                total--;
                return;
            }
        }
        System.out.println("Matricula " + matricula + " nao encontrada para exclusao.");
    }

    void listarTodos() {

        System.out.println("---------- Lista de Estudantes ----------");
        if (total == 0) {
            System.out.println("Nenhum estudante cadastrado.");
        }
        for (int i = 0; i < total; i++) {
            System.out.println((i + 1) + ". " + nomes[i] + " | " + matriculas[i]);
        }
    }

}
