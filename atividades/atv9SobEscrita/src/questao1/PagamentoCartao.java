package questao1;

public class PagamentoCartao extends Pagamento {

    public PagamentoCartao(double valor, String mercadoria) {
        super(valor, mercadoria);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Iniciando transação via Cartão de Crédito de Gringotes...");
        System.out.printf("Aprovando a compra de '%s' no valor de %.2f Galeões.\n", mercadoria, valor);
    }
}
