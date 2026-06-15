package questao1;

public class Main {
    public static void main(String[] args) {
        Loja lojaDeArtigosMagicos = new Loja();

        Pagamento p1 = new PagamentoCartao(150.00, "Espada de Prata");
        Pagamento p2 = new PagamentoBoleto(45.50, "Poção Andorinha");
        Pagamento p3 = new PagamentoPix(2000.00, "Vassoura Firebolt");

        System.out.println("--- BEM-VINDO AO EMPÓRIO MULTIVERSAL ---\n");

        lojaDeArtigosMagicos.receberPagamento(p1);
        lojaDeArtigosMagicos.receberPagamento(p2);
        lojaDeArtigosMagicos.receberPagamento(p3);
    }
}
