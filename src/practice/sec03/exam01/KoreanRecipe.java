package practice.sec03.exam01;


public class KoreanRecipe extends Recipe{

    public KoreanRecipe(){
        super("김치찌개", 20, false);
    }
    @Override
    public String getDescription() {
        return "매콤한 "+super.title+"를 추천합니다!";
    }

}
