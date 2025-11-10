package oop1;

public class MusicPlayerMain1 {
  public static void main(String[] args) {
    int volume = 0;
    boolean isOn = false;

    isOn = true;
    System.out.println("뮤직 플레이어를 시작합니다.");

    volume++;
    System.out.println("음악 플레이어 볼륨: " + volume);

    volume++;
    System.out.println("음악 플레이어 볼륨: " + volume);

    volume--;
    System.out.println("음악 플레이어 볼륨: " + volume);

    System.out.println("음악 플레이어 상태 확인");
    if (isOn) {
      System.out.println("음악 플레이어가 켜져있습니다. 볼륨: " + volume);
    } else {
      System.out.println("음악 플레이어가 꺼져있습니다.");
    }

    isOn = false;
    System.out.println("음악 플레이어를 종료합니다.");
  }
}
