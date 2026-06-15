package questao10;

public class Questao10 {
    public static void main (String[] args) {

        Q10Estudantes gerenciador = new Q10Estudantes();

        System.out.println("=============| INSERINDO ESTUDANTES |=============");
        gerenciador.inserir("Carlos Silva",   "2024001");
        gerenciador.inserir("Ana Paula",      "2024002");
        gerenciador.inserir("Rafael Lima",    "2024003");
        gerenciador.inserir("Beatriz Santos", "2024004");
        gerenciador.listarTodos();


        System.out.println("\n=============| EXCLUINDO |=============");
        gerenciador.excluir("2024001");
        gerenciador.listarTodos();

    }
}
