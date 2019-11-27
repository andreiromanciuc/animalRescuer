package org.fasttrackit;

public class Adopter {

    private String name;
    private int age;

    // initial money for game will be 100 um., will decrease for different activities
    private int money;

    // increase money when the animal is full healthy or if he's not hungry etc.
    private int increaseMoney;

public void feedAnimal(CookieFood cookie, Animal animal){

    System.out.println(getName() +" just gave some "+ cookie.getName() + " food to "+ animal.getName());
    System.out.println("Hungry level is at: "+ animal.getHungryLevel());
    animal.setHungryLevel(animal.getHungryLevel()-1);
    System.out.println("Hungry level decrease to: "+animal.getHungryLevel());

}

public void walk(HappyTime time, Animal animal){
    System.out.println(getName() +" just "+ time.getName() + " with "+ animal.getName());
    System.out.println("Spirit level is at: "+ animal.getSpiritLevel());
    animal.setSpiritLevel(animal.getSpiritLevel()+1);
    System.out.println("Spirit level increase to: "+animal.getSpiritLevel());

}



    public Adopter(String name, int age) {
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
