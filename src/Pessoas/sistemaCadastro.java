package Pessoas;

public class sistemaCadastro {
    public static void main(String[] args) {
        Pessoas marco = new Pessoas("048.268-78", "marco");

        marco.setEndereco("Rua das acacias");


        System.out.println(marco.getNome() + " " + marco.getCpf());
    }



}
