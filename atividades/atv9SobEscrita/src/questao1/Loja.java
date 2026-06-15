package questao1;

public class Loja {

    public void receberPagamento(Pagamento pagamento) {
            System.out.print("Processando");
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
            }
            System.out.println("\n");

            pagamento.processarPagamento();

            System.out.println("Transação finalizada!\n");
    }
}
