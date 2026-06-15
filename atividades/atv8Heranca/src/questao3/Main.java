package questao3;

public class Main {
    public static void main (String[] args) {

        Artigo artigo1 = new Artigo(
                "Produção Agrícola no Semiárido Nordestino", "Silva, M. A.", 2022,
                "Congresso Brasileiro de Agronomia", "101234");
        Artigo artigo2 = new Artigo(
                "Impactos da Seca no Semiárido", "Oliveira, J. C.", 2023,
                "Simpósio de Recursos Hídricos do Nordeste", "105678");
        Livro livro1 = new Livro(
                "Grande Sertão: Veredas", "Guimarães Rosa, J.", 1956,
                "Lendo mais", 624, 1);
        Livro livro2 = new Livro(
                "Vidas Secas", "Graciliano Ramos", 1938,
                "Lendo mais", 176, 27);
        Relatorio rel1 = new Relatorio(
                "Diagnóstico Hídrico do Vale do São Francisco", "CODEVASF", 2021,
                "Companhia de Desenvolvimento dos Vales do São Francisco", "CVS-2021-047", false);
        Relatorio rel2 = new Relatorio(
                "Análise Rural", "INCRA", 2020,
                "Instituto Nacional de Colonização e Reforma Agrária", "INC-2020-115", true);

        Reositorio repo = new Reositorio("Acervo Nordeste");
        for (Publicacao p : new Publicacao[]{artigo1, artigo2, livro1, livro2, rel1, rel2})
            repo.adicionar(p);

        repo.listarTodas();
        repo.buscarPorAutor("Graciliano");
        repo.gerarReferencias();

    }
}
