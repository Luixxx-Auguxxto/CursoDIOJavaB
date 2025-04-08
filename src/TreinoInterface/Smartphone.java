package TreinoInterface;

public class Smartphone implements VideoPlayer, MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("O smartphone esta tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O smartphone esta Pausando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O smartphone esta Parando música");
    }

    @Override
    public void playVideo() {
        System.out.println("O smartphone esta Iníciando vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O smartphone esta Pausando vídeo");

    }

    @Override
    public void stopVideo() {
        System.out.println("O smartphone esta Parando música");
    }
}
