package questao5;

import java.util.Scanner;

public class MainQ5 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String tipo;
        String material;
        double peso;
        int maior = 0;

        Mochila[] mochilas = new Mochila[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("PREENCHA A MOCHILA: " + (i + 1));
            System.out.println("DIGITE O TIPO: ");
            tipo = scanner.nextLine();
            System.out.println("DIGITE O MATERIAL: ");
            material = scanner.nextLine();
            System.out.println("DIGITE O PESO MÁXIMO: ");
            peso = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("===========================");

            mochilas[i] = new Mochila(tipo, material, peso);
        }

        for (int i = 0; i < 3; i++) {
            if (mochilas[i].getPesoMaximo() > mochilas[maior].getPesoMaximo())
                maior = i;
        }

        System.out.println("MOCHILA COM MAIOR PESO MÁXIMO: " + mochilas[maior].getTipo());
    }
}
