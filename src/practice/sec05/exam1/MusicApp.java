package practice.sec05.exam1;

public class MusicApp {
    public String user;
    String title;
    String artist;
    String genre;

    public MusicApp(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    class MusicPlayer {
        public void play(){
            String effect = "";
            if(genre.equals("HIPHOP")) {
                effect = "💥";
            }else if(genre.equals("BALLAD")){
                effect="🎵";
            }else{
                effect = "🎧";
            }
            System.out.println(effect+" "+title+" - "+artist+"  을(를) 재생합니다. "+effect);
        }

    }

}
