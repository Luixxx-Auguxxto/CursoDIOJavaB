package Introducao;

public class SistemaAprovacao {
    public static void main(String[] args) {
        int nota = 7;
        int nota2 = 4;
        String resultado = nota >=7 ? "Aprovado": "Reprovadp";
        String resultado2 = nota2 >=7 ? "Aprocado": nota >=5 && nota<7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
        System.out.println((resultado2));
    }
}
