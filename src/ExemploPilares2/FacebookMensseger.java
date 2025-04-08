package ExemploPilares2;

public class FacebookMensseger extends ServicoMensagemInstantanea{
    @Override
    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Enviado essa mensagem pelo Facebooj");

    }

    @Override
    public void enviarMensagem() {
        System.out.println("Recebendo essa mensagem pelo Facebook");

    }
}
