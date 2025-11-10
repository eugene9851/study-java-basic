package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.on();
        player.increaseVolume();
        player.increaseVolume();
        player.decreaseVolume();
        player.showStatus();
        player.off();
    }
}
