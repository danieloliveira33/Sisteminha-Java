import java.util.Scanner;

public class questao10 {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int [6];
        int[] pares = new int [6];
        int[] impares = new int [6];
        int qtdPar = 0;
        int qtdImpar = 0;
        int somaPar = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite um numero:");
            numeros[i] = scanner.nextInt();

            if (numeros[i]%2 == 0){
                pares[qtdPar] = numeros[i];
                qtdPar++;
            } else {
                impares[qtdImpar] = numeros[i];
                qtdImpar++;
            }
        }

        System.out.println("\n\nOs números pares digitados foram:");
        for (int i = 0; i < qtdPar; i++) {
            System.out.println(pares[i]);
            somaPar += pares[i];
        }

        System.out.println("\n\nA soma dos numeros pares digitados é de: " + somaPar);

        System.out.println("\n\nOs números ímpares digitados foram:");
        for (int i = 0; i < qtdImpar; i++) {
            System.out.println(impares[i]);
        }

        System.out.println("\n\nA quantidade de numeros impares digitados é de: " + qtdImpar);
    }

}
