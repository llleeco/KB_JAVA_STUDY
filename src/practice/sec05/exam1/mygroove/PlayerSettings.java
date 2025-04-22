package practice.sec05.exam1.mygroove;

public class PlayerSettings {
   public static class Mode{
        static final int MIN_VOLUME = 0;
        static final int MAX_VOLUME = 10;

        static boolean shuffle = false;
        static boolean repeat = true;
        static int volumeLevel = 5;

       public static boolean isShuffle() {
           return shuffle;
       }

       public static boolean isRepeat() {
           return repeat;
       }

       public static int getVolumeLevel() {
           return volumeLevel;
       }

       public static void printSettings(){
            System.out.println("\uD83C\uDF9B 현재 재생 설정 상태");
            System.out.println("\t - Shuffle: " + (shuffle ?"ON":"OFF"));
            System.out.println("\t - Repeat: " + (repeat ?"ON":"OFF"));
            System.out.println("\t - Volume: "+volumeLevel );
        }

        public static void setShuffle(boolean value){
            shuffle = value;

            System.out.println("Shuffle  모드가 "+(shuffle ?"ON":"OFF")+"으로 설정되었습니다.");
        }
        public static void setRepeat(boolean value){
            repeat = value;

            System.out.println("Repeat 모드가 "+(repeat ?"ON":"OFF")+"으로 설정되었습니다.");
        }

        public static void setVolumeLevel(int level){
            if(level>=MIN_VOLUME  && level<=MAX_VOLUME){
                volumeLevel = level;
                System.out.println("볼륨이 "+level+"로 설정되었습니다.");
            }else{
                System.out.println("볼륨은 0~10 사이로 설정해야 합니다.");
            }
        }

    }
}
