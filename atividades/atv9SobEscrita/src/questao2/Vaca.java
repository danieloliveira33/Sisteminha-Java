package questao2;

public class Vaca extends Animal {
    public Vaca(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Vaca [" + nome + "]: Muuu! (Pastando tranquilamente em Corvo Bianco)");
    }
}