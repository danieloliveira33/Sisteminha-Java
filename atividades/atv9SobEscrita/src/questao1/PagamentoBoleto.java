package questao1;

public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double valor, String mercadoria) {
        super(valor, mercadoria);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Gerando pergaminho de cobrança (Boleto)...");
        System.out.printf("Aguardando o pagamento de %.2f Coroas Novigradenses referente a '%s'.\n", valor, mercadoria);
    }
}