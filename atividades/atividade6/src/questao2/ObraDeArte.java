package questao2;

public class ObraDeArte {
    private String titulo;
    private String artista;
    private int anoDeProducao;

    public ObraDeArte(String titulo, String artista, int anoDeProducao) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoDeProducao = anoDeProducao;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getArtista() { return artista; }
    public void setArtista(String artista) { this.artista = artista; }

    public int getAnoDeProducao() { return anoDeProducao; }
    public void setAnoDeProducao(int anoDeProducao) { this.anoDeProducao = anoDeProducao; }
}
