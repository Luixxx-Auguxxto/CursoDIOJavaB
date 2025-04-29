package streamAPI.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args) {

        //cria uma lista de palavras

        List<String> palavras = Arrays.asList("Java", "kothin", "Python", "Javascript", "C", "go", "ruby");

        //cria um predicate que verifica se a palavra tem 5 caracteres

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        //usar o stram para filtrar as palavras com mais de 5 caracteres e,
        // em seguida imprimir cada palavra que passou no filtro

        palavras.stream()
                //com o predicate implementado
//                .filter(maisDeCincoCaracteres)

                //[implementando um predicate do zero
//                .filter(
//                        new Predicate<String>() {
//                            @Override
//                            public boolean test(String p) {
//                                return p.length() > 5;
//                            }
//                        }
//                )

                //lambda
                .filter(p -> p.length() > 5)

                .forEach(System.out::println);
    }
}
