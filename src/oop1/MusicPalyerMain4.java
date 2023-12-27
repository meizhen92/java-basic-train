package oop1;

public class MusicPalyerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.On();
        player.volumeUp();
        player.volumeUp();
        player.volumeDown();
        player.showStatus();
        player.Off();
    }
}
