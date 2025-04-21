package practice.sec03.exam02;

public class FusionRecipe extends Recipe{

    public FusionRecipe() {
        super("불닭파스타", 10, false);
    }

    @Override
    public String getDescription() {
        return "매콤달콤한 "+super.title+"를 추천합니다!";
    }
}
