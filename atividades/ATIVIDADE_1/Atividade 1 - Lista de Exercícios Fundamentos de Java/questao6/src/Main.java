import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] fator1 = new int [10];
        int [] fator2 = new int [10];
        int [] resultado = new int [10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            fator1 [i] = scanner.nextInt();
        }

        System.out.println("Agora vamos preencher o fator 2");

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            fator2 [i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            resultado[i] = fator1[i] * fator2[i];
            System.out.printf("\nmultiplicando: %d * %d = %d", fator1[i], fator2[i], resultado[i]);
        }

        System.out.printf("\n\n");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d  ", resultado[i]);
        }

    }

}