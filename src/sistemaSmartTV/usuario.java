package sistemaSmartTV;

public class usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVlume();
        smartTV.diminuirVlume();
        smartTV.diminuirVlume();
        smartTV.aumentatVolume();

        System.out.println("Canal atual?: " + smartTV.canal);
        smartTV.mudarCanal(17);
        System.out.println("Canal atual?: " + smartTV.canal);

        System.out.println("Volume atual?: " +smartTV.volume);

        System.out.println("TV ligada?: " + smartTV.ligada);
        System.out.println("Canal atual?: " + smartTV.canal);
        System.out.println("Volume atual?: " +smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo status -> TV ligada?: "+ smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo status -> TV ligada?: "+ smartTV.ligada);
    }
}
