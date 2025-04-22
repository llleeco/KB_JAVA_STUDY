package practice.sec05.exam1.mygroove;

public class PlayerUI {

    private ClickListener clickListener;

    public interface ClickListener {
        void onClick();
    }
    public void setClickListener(ClickListener listener){
        this.clickListener = listener;
    }
    public void clickPlayButton(){
        if(clickListener!=null){
            this.clickListener.onClick();
        }else{
            System.out.println("❌ 리스너가 등록되지 않았습니다.");
        }

    }
}
