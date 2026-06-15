package questao1;
public class Cliente {

    String nome;
    String cpf;
    String endereco;
    int idade;
    char sexo;
    boolean cadastro;

    void status() {
        if (this.cadastro == true) {
            System.out.println("Cliente cadastrado");
        }else{
            System.out.println("Cliente nao cadastrado");
        }
    }

    void mostrarDados () {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Sexo: " + this.sexo);
    }

    void validarCPF () {

        int[] cpffinal = new int[11];
        int indice = 0;

        for (int i = 0; i < this.cpf.length(); i++) {
            char c = this.cpf.charAt(i);
            if (Character.isDigit(c) && indice < 11) {
                cpffinal[indice] = Character.getNumericValue(c);
                indice++;
            }
        }

            int contdesc = 10;
            int soma = 0;
            int primeirodv = 0;
            int segundodv = 0;

            for (int i = 0; i < 9; i++) {
                soma += cpffinal[i] * contdesc;
                contdesc--;
            }

            if (soma % 11 == 0 || soma % 11 == 1) {
                primeirodv = 0;
            } else {
                primeirodv = 11 - soma % 11;
            }

            soma = 0;
            contdesc = 11;
            for (int i = 0; i < 10; i++) {
                soma += cpffinal[i] * contdesc;
                contdesc--;
            }

            if (soma % 11 == 0 || soma % 11 == 1) {
                segundodv = 0;
            } else {
                segundodv = 11 - soma % 11;
            }

            if (cpffinal[9] == primeirodv && cpffinal[10] == segundodv) {
                System.out.println("CPF VALIDADO!");
            }else {
                System.out.println("CPF INVALIDO!");
            }
    }
}
