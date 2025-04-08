package Introducao;

import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Excecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
        try {


            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobre nome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            //impressoes
            System.out.println("Ola! Me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm");
        }
        catch (InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser númericos");
        }
        finally {
            System.out.println("Execute o novamente");

        }





    }
}
