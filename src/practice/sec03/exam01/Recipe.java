package practice.sec03.exam01;

public class Recipe {
    protected String title;
    protected int cookTime;
    protected boolean isVegan;

    public Recipe(String title, int cookTime, boolean isVegan) {
        this.title = title;
        this.cookTime = cookTime;
        this.isVegan = isVegan;
    }

    public String getDescription() {
        return title+"를 추천합니다.!";
    }

    public String toString() {
        String str;
        if (isVegan) {
            str = "비건";
        } else {
            str = "비건 아님";
        }
        return title + "(" + cookTime + " 분) - " + str;
    }
}
