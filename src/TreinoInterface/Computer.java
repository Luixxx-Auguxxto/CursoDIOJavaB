package TreinoInterface;

public class Computer implements VideoPlayer, MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("O computador esta tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O computador esta Pausando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O computador esta Parando música");
    }

    @Override
    public void playVideo() {
        System.out.println("O computador esta Iníciando vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O computador esta Pausando vídeo");

    }

    @Override
    public void stopVideo() {
        System.out.println("O computador esta Parando música");
    }
}
