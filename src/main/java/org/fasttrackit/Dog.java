package org.fasttrackit;

public class Dog extends Animal {




    public Dog(String name) {
        super(name);
    }

    public Dog() {
        this.setName(getName());
    }

    public String toString(){
        return  "wags his tail.";
    }




}
