package questao9;

public class Questao9 {
    public static void main (String[] args) {

        Veiculo v1 = new Veiculo();
        Veiculo v2 = new Veiculo();

        v1.modelo = "Civic";
        v1.marca = "Honda";
        v1.ano = 2020;
        v1.placa = "ABC-1234";
        v1.disponivel = true;

        v2.modelo = "Corolla";
        v2.marca = "Toyota";
        v2.ano = 2018;
        v2.placa = "XYZ-9876";
        v2.disponivel = false;

        System.out.println("=============| Veiculo 1 |=============");
        v1.mostrarDados();
        System.out.println();
        v1.status();
        System.out.println();
        v1.calcularIdade(2025);

        System.out.println("\n=============| Veiculo 2 |=============");
        v2.mostrarDados();
        System.out.println();
        v2.status();
        System.out.println();
        v2.calcularIdade(2025);

        // ======================|  PARTE DA CLASSE LIVRO  |=================================

        Livro l1 = new Livro();
        Livro l2 = new Livro();

        l1.titulo = "Clean Code";
        l1.autor = "Robert C. Martin";
        l1.paginas = 431;
        l1.isbn = "978-0132350884";
        l1.disponivel = true;

        l2.titulo = "O Programador Pragmatico";
        l2.autor = "Andrew Hunt";
        l2.paginas = 352;
        l2.isbn = "978-8575221204";
        l2.disponivel = false;

        System.out.println("\n=============| Livro 1 |=============");
        l1.mostrarDados();
        System.out.println();
        l1.status();

        System.out.println("\n=============| Livro 2 |=============");
        l2.mostrarDados();
        System.out.println();
        l2.status();

    }
}
