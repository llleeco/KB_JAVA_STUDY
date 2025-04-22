package practice.sec05.exam1.mygroove;

public class GenrePlaybackManager {
    GenrePlayer genrePlayer;
    public interface GenrePlayer {
        void play(String title, String artist);
    }

    public void setPlayer(GenrePlayer player)  // 전략 주입
    {
        genrePlayer = player;
    }
    // 전략에 따른 재생 실행
    public void play(String title, String artist){
        if(genrePlayer!=null){
            genrePlayer.play(title, artist);
        }else{
            System.out.println("❌ 재생 전략이 설정되지 않았습니다.");
        }

    }
}
