package Escola;

public class Escola {
    public static void main(String[] args) {
       /* Aluno Felipe = new Aluno();
        //atribuição dos valores do objeto Felipe
        Felipe.nome = "Felipe";
        Felipe.idade = 8;


        System.out.println("O aluno "+ Felipe.nome + " tem " + Felipe.idade);

        */
        //Padrão java beans

        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(8);

        System.out.println("O aluno "+  felipe.getNome() + " tem " + felipe.getIdade() + " anos");
    }
}
