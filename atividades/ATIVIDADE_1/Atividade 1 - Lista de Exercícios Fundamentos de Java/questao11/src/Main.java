import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] produtos = new String[10];
        produtos[0] = "sabonete";
        produtos[1] = "pao";
        produtos[2] = "shampoo";
        produtos[3] = "condicionador";
        produtos[4] = "alcatra";
        produtos[5] = "feijao";
        produtos[6] = "arroz";
        produtos[7] = "sal";
        produtos[8] = "macarrao";
        produtos[9] = "uva";


        Double[] precos = new Double[10];
        precos[0] = 3.99;
        precos[1] = 1.99;
        precos[2] = 14.99;
        precos[3] = 14.99;
        precos[4] = 34.99;
        precos[5] = 6.99;
        precos[6] = 4.99;
        precos[7] = 1.99;
        precos[8] = 3.99;
        precos[9] = 8.99;

        int escolha = 0;

        boolean encerrar = false;
        while (!encerrar) {

            System.out.println ("\n\nEscolha uma opcao:");
            System.out.println ("1 - Buscar produto");
            System.out.println ("0 - Sair");
            escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    scanner.nextLine();
                    System.out.println("\nDigite o nome do produto");
                    String busca = scanner.nextLine();

                    for (int i = 0; i < 10; i++) {
                        if(produtos[i].equals(busca)) {
                            System.out.printf("Produto encontrado: %s\n", produtos[i]);
                            System.out.printf("Preco: %.2f", precos[i]);
                        }
                    }


                    break;

                case 0:
                    encerrar = true;

                    break;

                default:
                    System.out.println("Opcao Invalida!");
            }

        }
    }
}