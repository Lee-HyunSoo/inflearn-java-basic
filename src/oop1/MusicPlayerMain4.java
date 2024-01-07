package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        // 음악 플레이어 켜기
        player.on();
        // 볼륨 증가 2번
        player.volumeUp();
        player.volumeUp();
        // 볼륨 감소
        player.volumeDown();
        // 음악 플레이어의 상태 확인
        player.musicStatus();
        // 음악 플레이어 끄기
        player.off();
    }
}
