package org.fasttrackit;

public class Dog extends Animal {


    public void highSpirit(){
        System.out.println("Rex wags his tail");
    }

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        this.setName(getName());
    }






}
