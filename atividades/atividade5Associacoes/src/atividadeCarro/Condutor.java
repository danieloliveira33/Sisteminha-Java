package atividadeCarro;

public class Condutor {

    private String cnh;

    public Condutor (String cnh) {
        this.cnh = cnh;
    }

    public void dirigir(Carro carro) {
        System.out.println("CONDUTOR " + getCnh() + " ... DIRIGINDO ...");
        System.out.println("É UM MODELO " + carro.getModelo());
        System.out.println("MOTOR" + carro.getMotor().getCilindrada());
    }


    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
