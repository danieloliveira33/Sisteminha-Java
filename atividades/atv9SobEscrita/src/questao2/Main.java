package questao2;

public class Main {

    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();

        zoo.adicionarAnimal(new Cachorro("Canino"));
        zoo.adicionarAnimal(new Cachorro("Fofo (Cão de Três Cabeças)"));
        zoo.adicionarAnimal(new Gato("Bichento"));
        zoo.adicionarAnimal(new Vaca("Mimosa de Toussaint"));

        zoo.fazerBarulho();
    }
}

