package org.fasttrackit;

public class Adaptor {

    private String name;
    private int age;

    // initial money for game will be 100 um., will decrease for different activities
    private int money;

    // increase money when the animal is full healthy or if he's not hungry etc.
    private int increaseMoney;
    private Object HappyTime;
    private Object Animal;


    public Adaptor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void feed(CookieFood feedAnimal, String feedFood, int hungry){
        Object Animal;
        org.fasttrackit.Animal animal = new Animal("Rex",3,"black");


        System.out.println(getName() +" just gave some "+ CookieFood.getCookie() + " food to "+
                animal.getNameAnimal());

        hungry -= 4;
        System.out.println("Hungry level decrease to: "+hungry);

    }
    public void walk(String walking,String happyAnimal, int spirit){
        Object.class.cast(Animal);
        org.fasttrackit.Animal animal = new Animal("Rex",3, "black");
        Object.class.cast(HappyTime);
        org.fasttrackit.HappyTime time = new HappyTime();
        time.setHappyTimeName("walking");
        System.out.println(getName()+ " is "+ time.getHappyTimeName() + " with "+animal.getNameAnimal());

        spirit += 3;
        System.out.println("Spirit level increase to: "+spirit);

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
