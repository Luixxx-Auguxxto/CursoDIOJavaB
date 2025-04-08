package DesafioIphone;

public class Iphone implements Music, Browser, Phone{
    @Override
    public void seePage() {
        System.out.println("Exibindo página");
    }

    @Override
    public void addPage(String namePage) {
        System.out.println("Página: " + namePage + " foi adicionada");;
    }

    @Override
    public void updatePage() {
        System.out.println("Atualizando página");
    }

    @Override
    public void playMusic() {
        System.out.println("Tocando música");

    }

    @Override
    public void pauseMusic() {
    System.out.println("Pausando música");
    }

    @Override
    public void selectMusic(String nameMusic) {
        System.out.println("Música " + nameMusic + " selecionada");;
    }

    @Override
    public void calling() {
        System.out.println("Ligando");

    }

    @Override
    public void answer() {
        System.out.println("Atendendo");
    }

    @Override
    public void playMailBox() {
        System.out.println("Acessando caixa postal");

    }
}
