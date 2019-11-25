package org.fasttrackit;

public class GenderMale extends Adaptor {
    private String name;
    private int age;

public void feed (GenderMale adaptorName, FoodForAnimal foodName){

}

    public GenderMale(String name) {
        this.name = name;
    }

    public GenderMale(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
