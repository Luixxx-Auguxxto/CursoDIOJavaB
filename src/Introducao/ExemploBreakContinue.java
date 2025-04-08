package Introducao;

public class ExemploBreakContinue {

    public static void main(String[] args) {
         for( int i = 0; i < 10; i++){
             System.out.println(i);
             if (i==6){
                 System.out.println(i);
                 continue;
             }
             else if (i == 9){
                 System.out.println(i);
                 break;
             }
             else {
                 System.out.println("Não é igual a 6");
             }
         }
    }
}
