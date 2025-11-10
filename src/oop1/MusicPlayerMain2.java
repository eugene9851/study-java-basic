package oop1;

public class MusicPlayerMain2 {
  public static void main(String[] args) {
    MusicPlayerData data = new MusicPlayerData();

    data.isOn = true;
    System.out.println("뮤직 플레이어를 시작합니다.");

    data.volume++;
    System.out.println("음악 플레이어 볼륨: " + data.volume);

    data.volume++;
    System.out.println("음악 플레이어 볼륨: " + data.volume);

    data.volume--;
    System.out.println("음악 플레이어 볼륨: " + data.volume);

    System.out.println("음악 플레이어 상태 확인");
    if (data.isOn) {
      System.out.println("음악 플레이어가 켜져있습니다. 볼륨: " + data.volume);
    } else {
      System.out.println("음악 플레이어가 꺼져있습니다.");
    }

    data.isOn = false;
    System.out.println("음악 플레이어를 종료합니다.");
  }
}
