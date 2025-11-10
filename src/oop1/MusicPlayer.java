package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn;

    void on() {
        isOn = true;
        System.out.println("뮤직 플레이어를 시작합니다.");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void increaseVolume() {
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void decreaseVolume() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어가 켜져있습니다. 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어가 꺼져있습니다.");
        }
    }
}
