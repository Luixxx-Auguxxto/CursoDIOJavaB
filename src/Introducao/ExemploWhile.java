package Introducao;
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {

        double mesada = 50.0;
        while (mesada>0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada){
                valorDoce = mesada;

            }
                System.out.println("Valor do doce: " + valorDoce + "Adicionado ao carrinho");

                mesada -= valorDoce;
        }

    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }

}
