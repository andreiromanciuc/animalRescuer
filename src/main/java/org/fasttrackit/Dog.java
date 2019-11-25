package org.fasttrackit;

public class Dog extends Animal {


    private String animalNameDog;
    private String color;
    private String preferredFood;

    public Dog(int age) {
        super(age);
    }

    public String getAnimalNameDog() {
        return animalNameDog;
    }

    public void setAnimalNameDog(String animalNameDog) {
        this.animalNameDog = animalNameDog;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPreferredFood() {
        return preferredFood;
    }

    public void setPreferredFood(String preferredFood) {
        this.preferredFood = preferredFood;
    }
}
