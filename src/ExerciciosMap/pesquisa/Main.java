package ExerciciosMap.pesquisa;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProduto();

        estoqueProdutos.adicionarProduto(1L,"Produto A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoqueProdutos.adicionarProduto(3L, "Produto C", 2,15.0);
        estoqueProdutos.adicionarProduto(3L, "Prduto D", 9, 55.99);

        estoqueProdutos.exibirProduto();

        System.out.println("Valor total do estoque: " + estoqueProdutos.calculaValorTotal());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
    }
}
