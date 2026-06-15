package questao9;

public class Veiculo {

    String modelo;
    String marca;
    String placa;
    int ano;
    boolean disponivel;

    void mostrarDados() {
        System.out.println("Modelo: " + this.marca + " " + this.modelo);
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano: " + this.ano);
    }

    void status() {
        if (this.disponivel) {
            System.out.println("Veiculo disponivel para uso.");
        } else {
            System.out.println("Veiculo indisponivel (em uso ou manutencao).");
        }
    }

    void calcularIdade(int anoAtual) {
        int idade = anoAtual - this.ano;
        System.out.println("Idade do veiculo: " + idade + " ano(s).");
    }

}
