package EntendendoList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Exemplo sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10); //permite adicionar qualquer tipo de objeto

        //Exemplo com Generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        //Iterando sobre a lista com Generics
        for (String elemnto : listaGenerics){
            System.out.println(elemnto);
        }

        //interando sobre a lista sem generics (necessario fazer cast)
        for (Object elemento: listaSemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}
