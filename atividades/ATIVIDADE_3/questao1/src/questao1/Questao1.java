package questao1;
public class Questao1 {
    public static void main (String[] args) {

        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();

        System.out.println("=============| Cliente 1 |=============");

        c1.nome = "daniel";
        c1.cpf = "063.748.615-31";
        c1.endereco = "rua alagoas";
        c1.sexo = 'm';
        c1.idade = 19;
        c1.cadastro = true;

        System.out.println("-----------Dados-----------");
        c1.mostrarDados();
        System.out.println("\n-----------Status-----------");
        c1.status();
        System.out.println("\n-----------Validar CPF-----------");
        c1.validarCPF();

        System.out.println("\n\n=============| Cliente 2 |=============");

        c2.nome = "doutor";
        c2.cpf = "102.861.435-77";
        c2.endereco = "rua da cubuca";
        c2.sexo = 'm';
        c2.idade = 498;
        c2.cadastro = false;

        System.out.println("-----------Dados-----------");
        c2.mostrarDados();
        System.out.println("\n-----------Status-----------");
        c2.status();
        System.out.println("\n-----------Validar CPF-----------");
        c2.validarCPF();

    }
}
