package ExemploPilares;

public class Autodromo {
    public static void main(String[] args) {
        Carro corolagr = new Carro();
        corolagr.setChassi("777777-77777");
        corolagr.ligar();

        Moto rrs1000 = new Moto();
        rrs1000.setChassi("9999999-999999");
        rrs1000.ligar();

        Veiculo coringa = rrs1000;
        coringa.ligar();

    }
}
