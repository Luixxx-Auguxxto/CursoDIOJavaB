package streamAPI.function;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Function {
    public static void main(String[] args) {

        //criar números inteiros

        List<Integer> numeros = Arrays.asList(1, 2, 4, 5);

        //Usa a Function com expressão lambda para dobrar todos os números
        java.util.function.Function<Integer, Integer> dobrar = numero -> numero * 2;

        //usa a função para dobrar todos os números no Stream e armazena-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                //Forma mais básica
//                .map(dobrar)
//                .toList()


                //lambda
                .map( n -> n * 2)

                        //INSTANCIANDO UM NOVO FUNCTION
//                        new java.util.function.Function<Integer, Integer>() {
//                            @Override
//                            public Integer apply(Integer n) {
//                                return n * 2;
//                            }
//                        }

                .toList();

        //Imprimir a lista de números dobrados
        numerosDobrados.forEach(System.out::println);

    }
}
