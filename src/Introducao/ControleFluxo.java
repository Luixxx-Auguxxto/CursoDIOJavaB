package Introducao;

public class ControleFluxo {
    public static void main(String[] args) {
        System.out.println("Bom dia, flor do dia!");

        double saldo = 25.0;
        double valorSolicitado = 25.5;

        if (valorSolicitado <saldo){
            saldo -= valorSolicitado;
            System.out.println(saldo);
        }
        else {
            System.out.println("Saldo insuficiente");
        }


    }
}
