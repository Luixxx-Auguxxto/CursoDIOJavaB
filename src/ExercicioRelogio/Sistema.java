package ExercicioRelogio;

public class Sistema {
    public static void main(String[] args) {
        Clock brlClock = new BRLClock();
        brlClock.setSecond(0);
        brlClock.setSecond(0);
        brlClock.setHour(12);

        System.out.println(brlClock.getTime());

        System.out.println(new USClock().convert(brlClock).getTime());


    }

}
