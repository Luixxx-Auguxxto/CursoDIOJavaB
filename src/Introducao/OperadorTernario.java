package Introducao;

public class OperadorTernario {
    public static void main(String[] args) {
        int a,b;

        a = 5;
        b = 6;
        System.out.println(Resultado(a,b));
    }
    public static String Resultado(int a, int b){
        if (a == b){
            return "Verdadeiro";
        }
        else {
            return "false";
        }
        //resultado = a == b ?  "Verdadeiro" :  "falso";
    }
}
