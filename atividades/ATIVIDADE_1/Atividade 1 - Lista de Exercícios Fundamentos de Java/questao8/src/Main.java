import java.util.Scanner;

public class Main{
  public static void main (String[] args){

      Scanner scanner = new Scanner(System.in);
      int[] vetor = new int[10];
      int[] duplicatas = new int[10];
      int qtd = 0;

      for (int i = 0; i < 10; i++) {
        System.out.println("Digite um numero:");
        vetor[i] = scanner.nextInt();
      }

      for (int i = 0; i < 10; i++) {
        for (int j = i + 1; j < 10; j++) {

          if(vetor[i] == vetor[j]) {

            boolean jaRegistrado = false;
            for (int k = 0; k < qtd; k++) {
              if(duplicatas[k] == vetor[i]) {
                jaRegistrado = true;
                break;
              }
            }

            if (!jaRegistrado) {
              duplicatas[qtd] = vetor[i];
              qtd++;
            }

          }
        }
      }

      if (qtd == 0) {
        System.out.println("\nNão há duplicatas\n");
      }else {
        System.out.println("\n\nOs numeros repetidos foram:");
        for (int i = 0; i < qtd; i++) {
          System.out.println(duplicatas[i]);
        }
      }
  }
}