import java.util.Scanner;

public class Main{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] clientes = new String[10];
        boolean opcao = false;
        int escolha = 0;

        do {
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Inserir cliente");
            System.out.println("2 - Mostrar cliente");
            System.out.println("0 - Sair");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:

                    boolean inserido = false;
                    for (int i = 0; i < 10; i++) {
                        if(clientes[i] == null) {
                            scanner.nextLine();
                            System.out.println("Digite o nome do cliente:");
                            clientes[i] = scanner.nextLine();
                            inserido = true;
                            break;
                        }
                    }

                    if (!inserido) {
                        System.out.println("Impossivel inserir, vetor lotado");
                    }
                    break;

                case 2:

                    boolean vazio = true;
                    System.out.println("\n");
                    for (int i = 0; i < 10; i++) {
                        if (clientes[i] != null) {
                            System.out.println(clientes[i]);
                            vazio = false;
                        }
                    }

                    if (vazio == true) {
                        System.out.println("Nenhum cliente cadastrado\n\n");
                    }
                    break;

                case 0:
                    opcao = true;
                    break;

                default:
                    System.out.println("Opcao Invalida!");
            }

        }while (!opcao);

    }
}