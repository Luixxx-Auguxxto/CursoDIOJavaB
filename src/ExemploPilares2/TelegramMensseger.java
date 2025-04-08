package ExemploPilares2;

public class TelegramMensseger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando essa mensagem pelo Telegram");

    }

    @Override
    public void receberMensagem() {
        System.out.println("Recenbendo essa mensagem pelo Telegram");

    }
}
