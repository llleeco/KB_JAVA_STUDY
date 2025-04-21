package practice.sec03.exam02;

public class Main {
    public static void main(String[] args) {
        Recipe[] recipes = {
                new KoreanRecipe(),
                new VeganRecipe(),
                new FusionRecipe()
        };

        String[] names = { "현수", "소영", "민재" };

        System.out.println("[AI 꾸미의 자동 레시피 추천 결과]\n");

        for (int i = 0; i < recipes.length; i++) {
            System.out.println(names[i] + "님께 추천: " + recipes[i].getDescription());
        }
    }
}
