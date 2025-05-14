package DesafioBanco;

public abstract class Conta implements Iconta {


    //constante de agencia
    private static final int AGENCIA_PADRAO = 0001;

    //CONSTANTE SEQUENCIAL PARA IR AUMENTANTO SEQUENCIALMENTE
    private static int SEQUENCIAL = 1;

    protected int agencia;

    protected int numero;

    protected int saldo;

    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;

    }

    @Override
    public void depositar(double valor ) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfoConta() {
        System.out.println(String.format("Titular: " + this.cliente.getNome()));
        System.out.println(String.format("Agencia: " + this.agencia));
        System.out.println(String.format("Numero: " + this.numero));
        System.out.println(String.format("Saldo: " + this.saldo));
    }
}
