import java.util.Scanner;

public class Main {

    public static int[] duplicarVetor(int x, int[] y){
        int[] novoVetor = new int[(x * 2)];
        for (int i = 0; i < x; i++) {
            novoVetor[i] = y[i];
        }
        return novoVetor;
    }

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tamanho = 10;
        int[] numeros = new int[tamanho];
        int[] selecionados = new int[tamanho];
        int quantos = 0;


        System.out.println("\n===================| AVISO |===================");
        System.out.println("\n\nA cada ciclo de preenchimento do vetor serão");
        System.out.println("mostrados os numeros de 100 até 200 digitados");
        System.out.println("o primeiro será após 10 numeros, depois, a cada dobro");
        System.out.println("em que o vetor precisar crescer devido a quantidade.");
        System.out.println("de numeros digitados.");
        System.out.println("\n\nPara sair, basta digitar 0.");
        System.out.println("\n===================| AVISO |===================\n\n");

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite um número");

            numeros[i] = scanner.nextInt();
            if(numeros[i] == 0) {
                System.exit(0);
            }

            if (numeros[i] > 99 && numeros[i] < 201) {
                for (int e = 0; e < tamanho; e++) {
                    if (selecionados[e] == 0) {
                        selecionados[e] = numeros[i];
                        quantos++;
                        break;
                    }
                }
            }

            if ((i + 1) == tamanho) {

                System.out.println("Até agora, foram digitados estes números entre 100 e 200:");
                for (int j = 0; j < tamanho; j++) {
                    if (selecionados[j] != 0) {
                        System.out.printf("%d  ", selecionados[j]);
                    }
                }

                System.out.println("Um total de: " + quantos);
                System.out.print("\n\n");

                numeros = duplicarVetor(tamanho, numeros);
                selecionados = duplicarVetor(tamanho, selecionados);
                tamanho = tamanho * 2;

            }
        }

    }

}