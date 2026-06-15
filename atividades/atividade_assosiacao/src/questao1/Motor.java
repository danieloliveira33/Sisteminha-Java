package questao1;

public class Motor {

    private String idMotor;
    private boolean ligado;
    private double nivelCombustivel = 100;
    private double temperatura = 0;

    public String getIdMotor() {
        return idMotor;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void ligar() {
        if (ligado == true) {
            System.out.println("JÁ ESTÁ LIGADO");
        }else {
            System.out.println("LIGANDO MOTOR");
            ligado = true;
            temperatura += 60.0;
            nivelCombustivel -= 10.0;
        }
    }

    public void acelerar() {
        temperatura += 3.5;
        nivelCombustivel -= 0.5;
    }

    public void abastecer (double litros) {
        nivelCombustivel += litros;
    }

    public void desligar() {
        if (ligado == false) {
            System.out.println("JÁ ESTÁ DESLIGADO");
        }else {
            System.out.println("DESLIGANDO MOTOR");
            ligado = false;
            temperatura -= 60;
        }
    }
}
