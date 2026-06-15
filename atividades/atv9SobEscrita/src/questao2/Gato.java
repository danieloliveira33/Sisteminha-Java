package questao2;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Gato [" + nome + "]: Miau... (Encarando um Basilisco de relance)");
    }
}