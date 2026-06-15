import java.util.Scanner;
import java.util.Random;

public class questao5 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] times = {"Flamengo", "Bahia", "Fluminense", "Palmeiras", "São Paulo", "Corinthians", "Santos", "Vasco", "Internacional", "Botafogo" };

        String [] mensagens = new String [10];
        mensagens [0] = "Água mole, pedra dura, tanto bate até que fura";
        mensagens [1] = "Cão que ladra não morde";
        mensagens [2] = "Antes só do que mal acompanhado";
        mensagens [3] = "A pressa é a inimiga da perfeição";
        mensagens [4] = "Onde há fumaça, há fogo";
        mensagens [5] = "Quem não tem cão, caça com gato";
        mensagens [6] = "Gato escaldado tem medo de água fria";
        mensagens [7] = "Cada macaco no seu galho";
        mensagens [8] = "A cavalo dado não se olha os dentes";
        mensagens [9] = "Quem semeia vento, colhe tempestade";


        for (int i = 0; i < 10; i++) {
            System.out.printf("\n%d - %s", (i + 1), times[i]);
        }

        boolean flag = false;
        int escolha = 0;


        while (!flag) {
            System.out.println("\n\nEscolha um dos times");
            escolha = scanner.nextInt();
            if (escolha < 1 || escolha > 10) {
                flag = false;
                System.out.println("\nOpção inválida!");
            }else {
                flag = true;
            }
        }


        int mensagemRandom;
        mensagemRandom = random.nextInt(1, 11);
        // System.out.println("\n\n" + mensagemRandom);

        System.out.printf("\nVocê escolheu o time: %s", times[(escolha - 1)]);
        System.out.printf("\nA sua mensagem é: %s\n\n", mensagens[mensagemRandom]);


    }

}
