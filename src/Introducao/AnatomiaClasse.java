package Introducao;

public class AnatomiaClasse {
    public static void main(String[] args) {
        double medFinal =11;
        System.out.println(Boletim(medFinal));
    }

    public static String Boletim(double medFinal){
        if (medFinal <=4){
            return "Reprovado!";
        } else if (medFinal == 5) {
            return "Recuperação";
        } else if (medFinal >=6 && medFinal <=10) {
            return "Aprovado!";
        }
        else {
            return "Insita um valor valido!";
        }
    }
}
