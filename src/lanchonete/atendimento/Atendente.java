package lanchonete.atendimento;

public class Atendente {
    public void servindoMesas(){
        pegarLancheCozinha();
        System.out.println("Servindo a mesa");
    }
    private void pegarLancheCozinha(){
        System.out.println("Pegando lanche na cozinha");
    }
    public void receberPagamento(){
        System.out.println("Recebendo pagamento");
    }
    void trocarGas(){
        System.out.println("Atendente trocando gás");
    }
    private void pegarPedidoBalcao(){
        System.out.println("Pegando o pedido no balcao");
    }
}
