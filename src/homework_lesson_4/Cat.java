package homework_lesson_4;

public class Cat {
    int age;
    String color;

    public Cat(int ageCat, String colorCat) {
        this.age = ageCat;
        this.color = colorCat;
    }

    public void setAge(int ageCat) {
        this.age = ageCat;
    }

    public void setColor(String colorCat) {
        this.color = colorCat;
    }

    public String getColor() {
        return "Fur is " + this.color;
    }
}
