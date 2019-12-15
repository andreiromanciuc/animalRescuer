package org.fasttrackit;

public class Cat extends Animal {

    @Override
    public void highSpirit() {
        super.highSpirit();
        System.out.println(getName()+" purrs");
    }
}
