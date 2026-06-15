package questao3;

public class Main {
        public static void main(String[] args) {
            Calculadora calc = new Calculadora();

            System.out.println("--- CALCULADORA DE SINAIS E FEITIÇOS ---\n");

                System.out.print("Somando poções de cura (Inteiros)");
                int pocoes = calc.somar(5, 3);
                System.out.println("Resultado: " + pocoes + " frascos no inventário.\n");

                System.out.print("Somando peso dos minérios de Dimerítio (Decimais)");
                double peso = calc.somar(12.5, 7.8);
                System.out.println("Resultado: " + peso + " kg na mochila do Carpeado.\n");

                System.out.print("Combinando palavras mágicas (Strings)");
                String feitico = calc.somar("Expecto", "Patronum!");
                System.out.println("Resultado: " + feitico + " (O Dementador foi afastado!)\n");

        }
}
