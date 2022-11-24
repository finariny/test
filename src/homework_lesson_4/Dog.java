package homework_lesson_4;

public class Dog {
    String dogBreed;
    int spotsCount;

    public Dog(String dogBreed, int spotsCount) {
        this.dogBreed = dogBreed;
        this.spotsCount = spotsCount;
    }

    public String getDogBreed() {
        return "Dog breed is " + dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String getSpotsCount() {
        return "Spots count is " + spotsCount;
    }

    public void setSpotsCount(int spotsCount) {
        this.spotsCount = spotsCount;
    }
}
