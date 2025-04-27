package ExerciciosSet.produto;

public class Main {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto("Produto 4", 1341, 8.99, 59);
        cadastroProduto.adicionarProduto("Produto 2", 4216, 11.99, 64);
        cadastroProduto.adicionarProduto("Produto 3", 1341, 32.99, 19);
        cadastroProduto.adicionarProduto("Produto 3", 1349, 32.99, 19);
        cadastroProduto.adicionarProduto("Produto 1", 3321, 24.99, 10);

        System.out.println(cadastroProduto.produtoSet);


        System.out.println(cadastroProduto.exibirProdutosPorNomes());
        System.out.println(cadastroProduto.exibirProdutosPorPreco());

    }
}
