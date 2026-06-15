import java.util.Scanner;

public class questao2 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int tamanhoVetor = 20;

        int[] vetor = new int [tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.printf ("Digite o numero da posição: %d\n", i + 1);
            vetor[i] = scanner.nextInt();
        }

        System.out.println("VETOR ORIGINAL:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.printf(" %d |", vetor[i]);
        }

        int aux;

        for (int j = 0; j < tamanhoVetor - 1; j++) {
            for (int i = 0; i < tamanhoVetor - 1; i++) {
                if (vetor[i] < vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                }
            }
        }

        System.out.println();
        System.out.println("VETOR REORGANIZADO:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.printf("%d -- ", vetor[i]);
        }

    }

}
