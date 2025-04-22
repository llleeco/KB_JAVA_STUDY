package practice.sec05.exam1;

import practice.sec05.exam1.mygroove.PlayerSettings;
import practice.sec05.exam1.mygroove.PlayerUI;

public class AppMain2 {
    public static void main(String[] args) {
        PlayerUI ui = new PlayerUI();

        // ✅ 전역 모드 설정
        PlayerSettings.Mode.setShuffle(true);
        PlayerSettings.Mode.setRepeat(false);

        // ✅ 익명 구현 객체로 리스너 등록
        ui.setClickListener(new PlayerUI.ClickListener() {
            public void onClick() {
                // TODO: 셔플 모드일 경우 "🔀 셔플 모드로 재생합니다." 출력
                // TODO: 반복이 꺼져 있을 경우 "⏭ 반복 없이 한 번만 재생합니다." 출력
                // TODO: 위 두 조건이 모두 아니면 "▶ 일반 모드로 재생합니다." 출력
                if(PlayerSettings.Mode.isShuffle()){
                    System.out.println("\uD83D\uDD00 셔플 모드로 재생합니다.");
                }
                if(!PlayerSettings.Mode.isRepeat()){
                    System.out.println("⏭ 반복 없이 한 번만 재생합니다.");
                }else{
                    System.out.println("▶ 일반 모드로 재생합니다.");
                }


            }
        });

        // ✅ 버튼 클릭 시 동작
        ui.clickPlayButton();
    }
}
