package List2;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        ListaItem listaItem = new ListaItem();

        // Adicionando itens ao carrinho
        listaItem.adicionarItem("Lápis", 2d, 3);
        listaItem.adicionarItem("Lápis", 2d, 3);
        listaItem.adicionarItem("Caderno", 35d, 1);
        listaItem.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        listaItem.exibirItens();

        // Removendo um item do carrinho
        listaItem.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        listaItem.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + listaItem.calcularTotal());
    }
    }

