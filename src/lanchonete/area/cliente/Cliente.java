package lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche(){
        System.out.println("Escolhendo Lanche");
    }
    public void fazerPedido(){
        System.out.println("Fazendo pedido");
    }
    public void pagarConta(){
        consultarSaldoAplicativo();
        System.out.println("Pagando a conta");
    }
    private void consultarSaldoAplicativo(){
        System.out.println("Consultando saldo no aplicativo");
    }
    /*public void pegarPedidoBalcao(){
        System.out.println("Pegando édido no balcao");
    }

     */
}
