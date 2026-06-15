package questao5;

public class Main {
    public static void main (String[] args) {

        Pintura monalisa = new Pintura("Monalisa",1503, "Itália",  "Leonardo da Vinci",5000000000.0, "Óleo sobre tela","77 x 53 cm");
        Escultura tresGracas = new Escultura("As Três Graças", 1817, "França",  "Antonio Canova",80000000.0,"Mármore de Carrara",2600);
        Fotografia mangueEnc = new Fotografia("Manguezal Encantado",2020,"Brasil","Fábio Lacerda",8000.0,"50 x 70 cm",10);

        Exposicao expo1 = new Exposicao("Mestres da Renascença","01/03/2026", "30/06/2026");
        Exposicao expo2 = new Exposicao("Arte Contemporânea Brasileira","15/04/2026", "15/09/2026");

        expo1.adicionarObra(monalisa);
        expo1.adicionarObra(tresGracas);
        expo2.adicionarObra(mangueEnc);

        Museu museuNacional = new Museu("Museu Nacional de Arte", "Brasília");
        museuNacional.adicionarExposicao(expo1);
        museuNacional.adicionarExposicao(expo2);
        museuNacional.listarExposicoes();

    }
}
