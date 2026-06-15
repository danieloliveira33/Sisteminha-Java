package questao1;

public class MainQ1 {
    public static void main (String[] args) {

        Livro l1 = new Livro("Vidas Secas", "Graciliano Ramos", "NewLivros", 265, 9.99);

        System.out.println("========================");
        l1.getDados();

        System.out.println("========================");
        l1.setAlterarPreco(8.99);
        System.out.println("========================");


        l1.getDados();

        System.out.println("========================");
        l1.setAlterarPreco(-8.99);
        System.out.println("========================");


        l1.getDados();
    }
}
