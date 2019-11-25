package org.fasttrackit;

public class Cat extends Animal {
    private String animalNameCat;
    private String color;
    private String preferredHappyTime;


    public Cat(int age) {
        super(age);
    }


    public String getAnimalNameCat() {
        return animalNameCat;
    }

    public void setAnimalNameCat(String animalNameCat) {
        this.animalNameCat = animalNameCat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPreferredHappyTime() {
        return preferredHappyTime;
    }

    public void setPreferredHappyTime(String preferredHappyTime) {
        this.preferredHappyTime = preferredHappyTime;
    }
}
