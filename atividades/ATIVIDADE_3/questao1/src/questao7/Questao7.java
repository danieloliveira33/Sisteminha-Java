package questao7;

public class Questao7 {
    public static void main (String[] args) {

        /*
         * QUESTAO 7 - Para que serve o metodo main?
         *
         * O metodo main e o ponto de entrada de qualquer programa Java.
         * Quando voce executa um programa, a JVM (Java Virtual Machine) procura
         * exatamente por esse metodo para saber por onde comecar a execucao.
         *
         * Sua assinatura obrigatoria e:
         *   public static void main(String[] args)
         *
         * - public: precisa ser acessivel de fora da classe (pela JVM)
         * - static: pode ser chamado sem precisar criar um objeto da classe
         * - void: nao retorna nenhum valor
         * - String[] args: permite receber argumentos externos via linha de comando
         *
         * Sem o main, o programa nao sabe onde comecar e nao executa.
         * E a partir dele que criamos objetos, chamamos metodos e controlamos
         * o fluxo do programa.
         */


                ExemploQ7 ex = new ExemploQ7();

                System.out.println("=============| Demonstracao do Main |=============");
                System.out.println("O main foi chamado pela JVM automaticamente.");
                System.out.println("A partir dele, criamos objetos e chamamos metodos.\n");

                ex.nome = "Objeto de Exemplo";
                ex.valor = 42;
                ex.exibir();
                ex.dobrarValor();

    }
}
