package practice.sec03.exam03;

public class KoreanRecipe extends Recipe{
    @Override
    public String getDescription() {
        return "매콤한 김치찌개를 추천합니다!";
    }

    public String getSpicinessLevel() {
        return "맵기: ★★★☆☆";
    }
}
