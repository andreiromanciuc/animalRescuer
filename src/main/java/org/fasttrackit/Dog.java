package org.fasttrackit;

public class Dog extends Animal {

    @Override
    public void highSpirit() {
        super.highSpirit();
        System.out.println(getName() + " wags his tail.");
    }

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        this.setName(getName());
    }

}
