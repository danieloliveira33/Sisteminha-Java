import java.util.Scanner;

public class questao1 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int qtnotas = 5;
        double[] notas = new double[qtnotas];

        double media = 0;

        for (int i = 0; i < qtnotas; i++) {
            System.out.printf("Digite a nota %d\n", i + 1);
            notas[i] = scanner.nextDouble();

        }

        for (int i = 0; i < qtnotas; i++) {
            media = media + notas[i];
        }

        media = media / qtnotas;
        System.out.printf("A sua média é igual a : %.2f", media);

    }

}
