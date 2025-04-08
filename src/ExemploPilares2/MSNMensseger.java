package ExemploPilares2;

public class MSNMensseger extends ServicoMensagemInstantanea{
    @Override
    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN mensseger");

    }

    @Override
    public void enviarMensagem() {
        System.out.println("Recebendo essa mensagem pelo MSN mensseger");

    }
}
