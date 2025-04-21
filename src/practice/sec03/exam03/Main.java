package practice.sec03.exam03;

public class Main {
    public static void main(String[] args) {

        Recipe[] recipes = {
                new KoreanRecipe(),
                new VeganRecipe(),
                new FusionRecipe()
        };

        for (Recipe recipe : recipes) {
            System.out.println(recipe.getDescription());
            if (recipe instanceof KoreanRecipe koreanRecipe) {
                System.out.println("-> "+koreanRecipe.getSpicinessLevel());
            }
            System.out.println();
        }
    }
}
