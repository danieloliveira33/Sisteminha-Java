package questao1;

public abstract class Pagamento {
    protected double valor;
    protected String mercadoria;

    public Pagamento(double valor, String mercadoria) {
        this.valor = valor;
        this.mercadoria = mercadoria;
    }

    public abstract void processarPagamento();
}