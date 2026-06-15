package questao2;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Cachorro [" + nome + "]: Au au! (Rosnando para Dementadores)");
    }
}