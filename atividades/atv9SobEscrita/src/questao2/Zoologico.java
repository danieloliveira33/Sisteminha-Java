package questao2;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais;

    public Zoologico() {
        animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void fazerBarulho() {
        System.out.println("--- INICIANDO A RONDA NO ZOOLÓGICO MÁGICO ---\n");
        for (Animal animal : animais) {
                animal.emitirSom();
        }
        System.out.println("\nRonda finalizada. Todas as criaturas estão bem.");
    }

}