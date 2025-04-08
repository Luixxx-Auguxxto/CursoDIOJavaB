package Introducao;

import java.text.NumberFormat;
import java.text.ParseException;

public class Excecao2 {

    public static void main(String[] args) {
        //Number valor = Double.valueOf("a1.75");
        Number valor = null;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(valor);
    }
}
