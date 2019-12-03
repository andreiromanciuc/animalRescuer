package org.fasttrackit;

public class Dog extends Animal {


    public void highSpirit(Animal animal){
        System.out.println(animal.getName()+" wags his tail");
    }

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        this.setName(getName());
    }






}
