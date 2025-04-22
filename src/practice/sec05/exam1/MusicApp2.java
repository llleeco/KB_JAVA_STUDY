package practice.sec05.exam1;

public class MusicApp2 {
    private String user = "yura";

    public static class PlayerUI {
        public void show(MusicApp2 ma) {
            System.out.println("🎧 현재 사용자: " + ma.user); // ❌ 컴파일 에러 발생
        }
    }

    public static void main(String[] args) {
        MusicApp2.PlayerUI ui = new MusicApp2.PlayerUI();
        ui.show(new MusicApp2());
    }
}
