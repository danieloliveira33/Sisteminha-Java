package atividadeCarro;

public class Main {
    public static void main (String[] args) {

        Condutor Daniel = new Condutor("823792387-89");
        Carro fusion = new Carro("fusion", new Motor("Ford", "Gasolina", 2.0) );

        Daniel.dirigir(fusion);
    }
}
