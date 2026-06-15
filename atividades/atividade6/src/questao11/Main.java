package questao11;

public class Main {
    public static void main(String[] args) {

        Destino d1 = new Destino("Paris", "Franca", "Cidade Luz, Torre Eiffel e museus");
        Destino d2 = new Destino("Roma", "Italia", "Coliseu, Vaticano e gastronomia");
        Destino d3 = new Destino("Barcelona", "Espanha", "Sagrada Familia e praias");

        GuiaTuristico g1 = new GuiaTuristico("Pierre Dupont", "Frances/Portugues", 301);
        GuiaTuristico g2 = new GuiaTuristico("Marco Rossi", "Italiano/Ingles", 302);

        Pacote pa1 = new Pacote("Europa Classica", 12500.00);
        pa1.adicionarDestino(d1);
        pa1.adicionarDestino(d2);
        pa1.adicionarGuia(g1);
        pa1.adicionarGuia(g2);

        Pacote pa2 = new Pacote("Mediterraneo", 9800.00);
        pa2.adicionarDestino(d2); // Roma tambem esta neste pacote
        pa2.adicionarDestino(d3);
        pa2.adicionarGuia(g2);

        Agencia a1 = new Agencia("Viagens Premiere");
        a1.adicionarPacote(pa1);
        a1.adicionarPacote(pa2);

        System.out.println("---");
        a1.listarPacotes();
    }
}