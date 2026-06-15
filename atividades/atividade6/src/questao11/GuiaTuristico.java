package questao11;

public class GuiaTuristico {
    private String nome;
    private String idioma;
    private int idGuia;

    public GuiaTuristico(String nome, String idioma, int idGuia) {
        this.nome = nome;
        this.idioma = idioma;
        this.idGuia = idGuia;
    }

    public String getNome() { return nome; }
    public String getIdioma() { return idioma; }
    public int getIdGuia() { return idGuia; }
}