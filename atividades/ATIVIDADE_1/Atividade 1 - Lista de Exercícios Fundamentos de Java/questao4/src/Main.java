import java.util.Scanner;

public class Main {

  public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);
    int[] vetor = new int [10];
    int maior = 0;
    int menor = 0;

    for (int i = 0; i < 10; i++){
      System.out.println("Digite o valor da posição: " + (i + 1));
      vetor[i] = scanner.nextInt();
      if (vetor[i] > maior) {
        maior = vetor [i];
      } else if (vetor [i] < menor) {
        menor = vetor[i];
      }
    }

    for (int i = 0; i < 10; i++){
      System.out.printf("%d  ", vetor[i]);
    }
    System.out.println ("\n\nO maior número digitado foi: " + maior);
    System.out.println ("O menor número digitado foi: " + menor);

  }

}