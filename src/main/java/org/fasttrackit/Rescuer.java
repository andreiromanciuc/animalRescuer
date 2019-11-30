package org.fasttrackit;

import org.jetbrains.annotations.NotNull;



public class Rescuer {

    private String name;
    private int age;

    // initial money for game will be 100 um., will decrease for different activities
    private int money;

    // increase money when the animal is full healthy or if he's not hungry etc.
    private int increaseMoney;


public void feedAnimal(Food food, Animal animal){


    if (food.getName() == food.cookieFood.getCookie()){

        System.out.println(getName() + " just gave to " + animal.getName() + " some " + food.getName());
        animal.setSpiritLevel(animal.getSpiritLevel()+1);
        System.out.println("Spirit level has increase by one. Now it's: "+ animal.getSpiritLevel());
        food.setStockCookie(food.getStockCookie()-1);
        System.out.println("Stock of cookies has decrease by one. Now it's: "+food.getStockCookie());

    } else {

        System.out.println(getName() + " just gave some " + food.getName() + " food to " + animal.getName());
        animal.setHungryLevel(animal.getHungryLevel() - 1);
        System.out.println("Hungry level decrease to: " + animal.getHungryLevel());
    }
}

public void walk(HappyTime time, Animal animal){

    if (time.getName() == animal.getFavoriteTime()) {
        System.out.println(getName() + " just " + time.getName() + " with "+animal.getName());
        animal.setSpiritLevel(animal.getSpiritLevel()+2);
        System.out.println("Spirit level increase by 2. Now it's: "+animal.getSpiritLevel());
    }else {
        System.out.println(getName() + " just " + time.getName() + " with " + animal.getName());
        animal.setSpiritLevel(animal.getSpiritLevel() + 1);
        System.out.println("Spirit level increase to: " + animal.getSpiritLevel());
    }
}



    public Rescuer(String name, int age) {
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
