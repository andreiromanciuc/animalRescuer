package org.fasttrackit;

public class GenderFemale extends Adaptor {
    private String name;
    private int age;

    public GenderFemale(String name) {
        this.name = name;
    }

    public GenderFemale(int age) {
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
