package questao2;

public class Carro {

    private String modelo;
    private boolean ligado;
    private double nivelCombustivel;
    private double temperatura;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.ligado = false;
        this.nivelCombustivel = 100.0;
        this.temperatura = 20.0;
    }

    public void ligar() {
        if (ligado == true)
            System.out.println("CARRO JÁ ESTÁ LIGADO");
        else {
            ligado = true;
            this.injetarCombustivel();
            System.out.println("CARRO LIGADO");
        }
    }

    public void verificarStatus() {
        System.out.println("MODELO: " + modelo);
        System.out.println("LIGADO: " + ligado);
        System.out.println("GASOLINA: " + nivelCombustivel);
        System.out.println("TEMPERATUERA: " + temperatura);
    }

    private void injetarCombustivel() {
        nivelCombustivel -= 0.5;
        controlarTemperatura();
    }

    private void controlarTemperatura() {
        temperatura += 0.5;
    }

}
