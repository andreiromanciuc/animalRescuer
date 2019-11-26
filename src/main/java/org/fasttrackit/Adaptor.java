package org.fasttrackit;

public class Adaptor {

    private String name;
    private int age;

    // initial money for game will be 100 um., will decrease for different activities
    private int money;

    // increase money when the animal is full healthy or if he's not hungry etc.
    private int increaseMoney;

public void feedAnimal(CookieFood cookie, Animal animal, int hungryLevel){

    System.out.println(getName() +" just gave some "+ cookie.getFoodName() + " food to "+ animal.getNameAnimal());

    hungryLevel -= 4;
    System.out.println("Hungry level decrease to: "+hungryLevel);

}

public void walk(HappyTime time, Animal animal, int spirit){
    System.out.println(getName() +" just "+ time.getHappyTimeName() + " with "+ animal.getNameAnimal());
    spirit += 3;
    System.out.println("Spirit level increase to: "+spirit);

}



    public Adaptor(String name, int age) {
        this.name = name;
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


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getIncreaseMoney() {
        return increaseMoney;
    }

    public void setIncreaseMoney(int increaseMoney) {
        this.increaseMoney = increaseMoney;
    }
}
