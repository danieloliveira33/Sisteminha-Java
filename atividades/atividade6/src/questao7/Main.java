package questao7;

public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("Clean Code", "Robert C. Martin", "978-0132350884");
        Livro l2 = new Livro("Design Patterns", "Gang of Four", "978-0201633610");
        Livro l3 = new Livro("The Pragmatic Programmer", "Hunt e Thomas", "978-0135957059");

        Usuario u1 = new Usuario("Daniel", 1001);
        Usuario u2 = new Usuario("Carla", 1002);

        Biblioteca b1 = new Biblioteca("Biblioteca Central");
        b1.cadastrarLivro(l1);
        b1.cadastrarLivro(l2);
        b1.cadastrarLivro(l3);
        b1.cadastrarUsuario(u1);
        b1.cadastrarUsuario(u2);

        System.out.println("---");
        u1.pegarEmprestado(l1, "01/04/2025");
        u1.pegarEmprestado(l2, "01/04/2025");
        u2.pegarEmprestado(l1, "01/04/2025"); // ja emprestado

        System.out.println("---");
        b1.listarEmprestimosAtivos();

        System.out.println("---");
        u1.devolver(l1);
        b1.listarEmprestimosAtivos();
    }
}