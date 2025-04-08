package TreinoInterface;

public class
MusicBox implements MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("A caixa de música esta tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A caixa de música esta Pausando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("A caixa de música esta Parando música");
    }
}
