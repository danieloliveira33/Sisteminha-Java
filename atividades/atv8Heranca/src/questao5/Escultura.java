package questao5;

public class Escultura extends ObraArte{

    private String material;
    private double peso;

    public Escultura(String titulo, int anoCriacao, String origem,
                     String artista, double valorEstimado, String material, double peso) {
        super(titulo, anoCriacao, origem, artista, valorEstimado);
        this.material = material;
        this.peso = peso;
    }

    @Override
    public void descrever() {
        super.descrever();
        System.out.println("  Material: " + material + " | Peso: " + peso + " kg");
    }

}
