package lanchonete.atendimento;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que não precisam estarem dispiniveis para toda aplicação
        /*cozinheiro.selecionarIngredietesLanche();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();

         */

        //Ações que estabelecimento precisa ter ciencia
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        /*Almoxarife almoxarife = new Almoxarife();

         */
        //ações que não precisam estarem disponiveis para toda aplicação
        /*lmoxarife.controlarEntrada();
        almoxarife.controlarSaida();

         */
        //ações que somente o seu pacote cozinha precisa conhecer (defalt)
        /*almoxarife.entregarIngredientes();
        almoxarife.trocarGas();
        A partir do momento que esses métodos
        se tornaram default, o estabelecimento
        não tem mais acesso.
         */

        Atendente atendente = new Atendente();
        ///atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesas();
        //ações que somente o seu pacote cozinha precisa conhecer (default)
        atendente.trocarGas();

        Cliente cliente = new Cliente();
        /*Não deveria, mas o estabelecimento
        ainda não definiu normas de atendimento*/
        //cliente.pegarPedidoBalcao();

        //esta ação é muito sigilosa, que tal ser private?
        //cliente.consultarSaldoAplicativo();

        //Já pensou os clientes ouviondo que o gás acabou?
        /*cozinheiro.pedirParaTrocarGas(atendente);
        cozinheiro.pedirParaTrocarGas(almoxarife);
         */


    }

}
