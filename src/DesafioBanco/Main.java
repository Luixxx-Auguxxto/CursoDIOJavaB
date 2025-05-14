package DesafioBanco;

public class Main {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.setNome("Lucio");


        Conta cc = new ContaCorrente(lucas);
        Conta cp = new ContaPoupanca(lucas);

        cc.depositar(100);
        cc.transferir(95, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
