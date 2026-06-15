package questao2;

/*
    Discussão, Questão 2:

    Métodos públicos para o carro podem contemplar ações como "acelerar",
    "frear", "ligar", "virarDirecao", pois são ações comuns que devem
    estar disponíveis em uma simulação.

    Já métodos privados contemplam dados mais importantes do veículo,
    por exemplo, verificações de desempenho ou os cálculos de modos de direção,
    dentro dessa esfera, envolvemos funções como "medirBateria", "injetarCombustivel",
    "temperaturaLiquidoArrefecimento", etc.

    Em suma, os métodos públicos envolvem o que é mais comum ao comportamento do veículo
    e que estão mais próximos do motorista em relação ao software. Já os métodos privados
    devem envolver cálculos internos de cada módulo do veículo.

     */

public class MainQ2 {
    public static void main(String[] args) {

        Carro carro = new Carro("Fusca");

        System.out.println("=============================");
        carro.verificarStatus();
        System.out.println("=============================");
        carro.ligar();
        System.out.println("=============================");
        carro.verificarStatus();
    }
}
