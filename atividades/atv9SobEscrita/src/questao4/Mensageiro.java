package questao4;

public class Mensageiro {

    public void enviarMensagem(String texto) {
        System.out.println("[CORUJA PADRÃO] Mensagem enviada para Hogwarts:");
        System.out.println("Conteúdo: " + texto + "\n");
    }

    public void enviarMensagem(String texto, int prioridade) {
        String nivelPrioridade = prioridade > 5 ? "ALTA (Berrador)" : "BAIXA (Carta Normal)";
        System.out.println("[MINISTÉRIO DA MAGIA] Mensagem de prioridade " + nivelPrioridade + ":");
        System.out.println("Conteúdo: " + texto + "\n");
    }

    public void enviarMensagem(String texto, boolean comConfirmacao) {
        System.out.println("[MEGASCOPIO DA YENNEFER] Transmitindo sinal...");
        System.out.println("Conteúdo: " + texto);
        if (comConfirmacao) {
            System.out.println("Status: Confirmação de recebimento mágica ativada.\n");
        } else {
            System.out.println("Status: Enviado sem rastreio de leitura.\n");
        }
    }
}