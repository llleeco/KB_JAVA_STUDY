package practice.sec05.exam2;

public class LegacyPlayerAdapter implements Playable{

   LegacyPlayer legacyPlayer;

    public LegacyPlayerAdapter(LegacyPlayer legacyPlayer) {
        this.legacyPlayer = legacyPlayer;
    }

    @Override
    public void play(String title) {
        if(title.toLowerCase().contains("bad")){
            System.out.println("🚫: 금지어가 포함된 곡은 재생할 수 없습니다: "+title);
        }else{
            this.legacyPlayer.startPlay(title);
        }
    }
}
