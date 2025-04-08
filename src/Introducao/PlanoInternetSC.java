package Introducao;

public class PlanoInternetSC {
    public static void main(String[] args) {
        String plano = "P"; //P; //G;

        switch (plano){
            case "M":{
                System.out.println("100 Minutos de ligação\nE\nREDES SOCIAIS ILIMITADAS!!");
                break;
            }
            case "P":{
                System.out.println("100 MINUTOS DE LIGAÇÃO!!");
                break;
            }
            case "G":{
                System.out.println("Tudo dos pralnos anteriores, com adição de  15GB de YT");
                break;
            }
            default:
                System.out.println("Escolha uma opção valida");
                break;
        }
    }
}
