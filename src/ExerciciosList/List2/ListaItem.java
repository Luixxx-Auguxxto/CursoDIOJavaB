package ExerciciosList.List2;

import java.util.ArrayList;
import java.util.List;

public class ListaItem {

    private List<Item> itemList;

    public ListaItem(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemsParaRemover.add(i);
                }
            }
            itemList.removeAll(itemsParaRemover);
        }else {
            System.out.println("A lista está vazia");
        }
    }

    public double calcularTotal(){
        double valorTotal = 0d;
        if (!itemList.isEmpty()){
            for (Item i : itemList){
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public void exibirItens(){
        if (!itemList.isEmpty()){
            System.out.println(this.itemList);
        }else {
            System.out.println("A lista esta vazia");
        }
    }

    @Override
    public String toString() {
        return "ListaItem{" +
                "itemList=" + itemList;
    }
}
