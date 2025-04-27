package ExerciciosMap.pesquisa;

import ExerciciosMap.operacoesBasicas.Main;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProduto;

    public EstoqueProdutos() {
        this.estoqueProduto = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        estoqueProduto.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto() {
        System.out.println(estoqueProduto);
    }

    public double calculaValorTotal() {
        double valorTotalEstoque = 0d;
        if (!estoqueProduto.isEmpty()) {
            for (Produto p : estoqueProduto.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProduto.isEmpty()) {
            for (Produto p : estoqueProduto.values()) {
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
            }
        return produtoMaisCaro;
        }
    }
