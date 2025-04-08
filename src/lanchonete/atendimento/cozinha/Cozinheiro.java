package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {

    //pode ser default
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche natural no balção");
    }

    //pode ser default
    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando suco no balção");
    }

    //pode ser defalut
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche(){
        System.out.println("Preparando lanche");
    }
    private void prepararVitamina(){
        System.out.println("Preparando vitamina");
    }

    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredietesLanche(){
        System.out.println("Selecionando o pão, salada, ovo e carne");
    }

    /*private void pedirParaTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }*/

    private  void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes( Almoxarife  almoxarife){
        almoxarife.entregarIngredientes();
    }

}
