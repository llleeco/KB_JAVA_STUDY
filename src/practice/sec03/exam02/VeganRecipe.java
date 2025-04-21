package practice.sec03.exam02;


public class VeganRecipe extends Recipe {
    public VeganRecipe() {
        super("두부 샐러드", 10, true);
    }

    @Override
    public String getDescription() {
        return "신선한 "+super.title+"를 추천합니다!";
    }
}