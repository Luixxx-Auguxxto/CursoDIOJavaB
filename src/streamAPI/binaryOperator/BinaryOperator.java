package streamAPI.binaryOperator;

import java.util.Arrays;
import java.util.List;

public class BinaryOperator {
    public static void main(String[] args) {

        //cria uma lista de números inteiros

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usa o binary operator com expressão lambda para somar dois números inteiros

        java.util.function.BinaryOperator<Integer> somar = (n1, n2) -> n1 + n2;

        //usa o BinaryOperator para somar todos os números no stream
        //variavel com o método de calculo
//        int resultado = numeros.stream()
//                .reduce(0, somar);
        //instanciando o binaryOperator do zero
        int resultado = numeros.stream()
//                .reduce(0, new java.util.function.BinaryOperator<Integer>() {
//                    @Override
//                    public Integer apply(Integer n1, Integer n2) {
//                        return n1 + n2;
//                    }
//                });

        //lambda
//                .reduce(0,(n1,n2) -> n1 + n2);
                //simplificado
                //somando todos os valores dentro do stream
                .reduce(0, Integer::sum);

        //imprimi o resultado da soma
        System.out.println("A soma dos números é: " + resultado);
    }
}
