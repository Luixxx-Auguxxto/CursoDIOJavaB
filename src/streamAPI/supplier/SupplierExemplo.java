package streamAPI.supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemplo {
    public static void main(String[] args) {

        //Representa uma operação que não aceita nenhum argumeento e retorna um resultado do tipo T.

        // É comumente usada para criar ou fornecer novos objetos de um determinado tipo.


        //usar supplier com expressão lambda para fornecer uma saudação personalizada

        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        //USAR O SUPPLIER PARA OBTER UMA LISTA COM 5 SAUDAÇÕES

//        List<String> listaSaudacoes = Stream.generate(saudacao)
        //criando um supplier
        List<String> listaSaudacoes = Stream.generate(
//                        new Supplier<String>() {
//                            @Override
//                            public String get() {
//                                return "Olá, seja bem-vindo(a)!";
//                            }
//                        }
                        //   )
                        //}
            //Lambda
                () -> "Olá, seja bem-vindo(a)!")
                .limit(5)
//                .collect(Collectors.toList());
                //forma simplificada
                .toList();

        //imprimir as saudações geradas

        //lambda
//        listaSaudacoes.forEach(s -> System.out.println(s));
        //method reference
        listaSaudacoes.forEach(System.out::println);
    }

}
