package questao1;

public class PagamentoPix extends Pagamento {

    public PagamentoPix(double valor, String mercadoria) {
        super(valor, mercadoria);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Lendo chave mágica instantânea (Pix)...");
        System.out.printf("Transferência de %.2f Orens concluída com sucesso para a compra de '%s'.\n", valor, mercadoria);
    }
}