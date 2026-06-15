package questao2;

public class Main {
    public static void main(String[] args) {

        ObraDeArte o1 = new ObraDeArte("A Noite Estrelada", "Van Gogh", 1889);
        ObraDeArte o2 = new ObraDeArte("MonaLisa", "Leonardo Da Vinci", 1503);
        ObraDeArte o3 = new ObraDeArte("O Grito", "Van Gogh", 1893);

        Exposicao ex1 = new Exposicao("Impressionismo Europeu", "Pintura Classica");
        Exposicao ex2 = new Exposicao("Arte Nordica", "Expressionismo");

        ex1.adicionarObra(o1);
        ex1.adicionarObra(o2);
        ex2.adicionarObra(o3);

        Museu m1 = new Museu("Museu de Arte Moderna", "Sao Paulo");
        m1.adicionarExposicao(ex1);
        m1.adicionarExposicao(ex2);

        System.out.println("---");
        m1.listarExposicoes();

        System.out.println("---");
        ex1.removerObra(o2); // Mona Lisa sendo emprestada

        System.out.println("---");
        m1.listarExposicoes();
    }
}
