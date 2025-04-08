package sistemaSmartTV;

public class SmartTV {
    boolean ligada = false;
    int canal = 10;
    int volume = 25;


    public void mudarCanal(int canalNovo){
        canal = canalNovo;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }


    public void aumentatVolume(){
       volume++;
        System.out.println("Aumentando volume para: " + volume);
    }
    public void diminuirVlume(){
        volume--;
        System.out.println("Dimunuindo volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}
