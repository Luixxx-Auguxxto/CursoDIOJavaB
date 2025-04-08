package ExemploPilares2;

public class Sistema {
    public static void main(String[] args) {


        ServicoMensagemInstantanea smi = null;

        /*
        Não se sabe qual app
        Mas qualquer um deverá enviar e receber mensagem
         */

        String appEscolhido = "msn";

        if (appEscolhido.equalsIgnoreCase("MsN"))
            smi = new MSNMensseger();
        else if (appEscolhido.equalsIgnoreCase("Fb"))
            smi = new FacebookMensseger();
        else if (appEscolhido.equalsIgnoreCase("tL"))
            smi = new TelegramMensseger();

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
