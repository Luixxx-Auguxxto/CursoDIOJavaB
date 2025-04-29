package streamAPI.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo {
    public static void main(String[] args) {

        //Cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //Usa o Consumer com expressão lambda para imprimir números pares

        Consumer<Integer> imprimindoNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        //Usar o consumer para imprimir números pares no Stream
        //quando passa o Consumer no forEach o parametrô número é substituido por números
//        numeros.stream().forEach(imprimindoNumeroPar);


        //implementando o consumer
//        numeros.stream().forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer n) {
//                if (n % 2 == 0 ){
//                    System.out.println(n);
//                }
//            }
//        });

        //a mesma função só que em lambda
        //intellij retirou o .stream pq não era necessário
        numeros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
           }
        );
    }
}
