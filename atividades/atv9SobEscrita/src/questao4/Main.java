package questao4;

public class Main {
    public static void main(String[] args) {
        Mensageiro correio = new Mensageiro();

        System.out.println("--- SISTEMA DE COMUNICAÇÃO DE KHAER MORHEN / HOGWARTS ---\n");

        correio.enviarMensagem("Lembre-se de alimentar os testrálios hoje à tarde.");

        correio.enviarMensagem("RONY WEASLEY! COMO OUSA ROUBAR O CARRO?!", 10);

        correio.enviarMensagem("Geralt, encontre-me o mais rápido possível.", true);

    }
}
