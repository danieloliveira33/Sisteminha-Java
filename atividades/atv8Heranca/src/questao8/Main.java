package questao8;

public class Main {
    public static void main (String[] args) {

        Professor yennefer = new Professor("Yennefer","002.002.002-02", "P002", "Magia e Encantamentos");
        Aluno ciri = new Aluno("Ciri","003.003.003-03", "A001", "Artes Arcanas");
        Visitante vesemir = new Visitante("Vesemir", "006.006.006-06", "V001");

        Livro bestiario = new Livro("Bestiário de Kaer Morhen", "Vesemir","91");
        Livro alquimia = new Livro("Alquimia das Poções Superiores", "Yennefer","92");
        Livro esferas = new Livro("A Teoria das Esferas", "Ciri","93");
        Livro magiaAntiga = new Livro("Fundamentos da Magia Antiga", "Geralt de Rívia","94");

        Biblioteca bibliotecaKaer = new Biblioteca("Biblioteca de Kaer Morhen");

        bibliotecaKaer.cadastrarLivro(bestiario);
        bibliotecaKaer.cadastrarLivro(alquimia);
        bibliotecaKaer.cadastrarLivro(magiaAntiga);
        bibliotecaKaer.cadastrarLivro(esferas);

        bibliotecaKaer.cadastrarUsuario(yennefer);
        bibliotecaKaer.cadastrarUsuario(ciri);
        bibliotecaKaer.cadastrarUsuario(vesemir);

        bibliotecaKaer.emprestarLivro("91", "A001", "15/04/2026");
        bibliotecaKaer.emprestarLivro("92", "P001", "15/04/2026");
        bibliotecaKaer.emprestarLivro("93", "P002", "15/04/2026");
        bibliotecaKaer.emprestarLivro("94", "V001", "15/04/2026");

        bibliotecaKaer.listarAcervo();
        bibliotecaKaer.listarEmprestimos();
        bibliotecaKaer.listarUsuarios();

        bibliotecaKaer.devolverLivro("91", "A001");
        bibliotecaKaer.listarEmprestimos();
    }
}
