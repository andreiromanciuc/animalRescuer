package org.fasttrackit;

public class Adaptor {


    //male, female
    private boolean gender;

    // initial money for game will be 100 um., will decrease for different activities
    private int money;

    // increase money when the animal is full healthy or if he's not hungry etc.
    private int increaseMoney;

    GenderFemale female;
    GenderMale male;

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
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
