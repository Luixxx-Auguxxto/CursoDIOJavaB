package Introducao;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("0571300");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep é invalido");
            ;
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

            //simula um cep formatado
            return "23.765-064";



    }
}