package org.fasttrackit;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Animal animalReferences = new Animal();
        animalReferences.typeOfAnimal = "Dog";
        animalReferences.age = 3;
        animalReferences.color = "black";
        animalReferences.healthLevel = 4;
        animalReferences.hungryLevel = 2;
        animalReferences.preferredFood = "beef";
        animalReferences.preferredHappyTime = "To play with Adaptor";
        animalReferences.spiritLevel = 1;
        System.out.println("Type of animal: " + animalReferences.typeOfAnimal);
        System.out.println("Age: " + animalReferences.age);
        System.out.println("Color: " + animalReferences.color);
        System.out.println("Level of Health: " + animalReferences.healthLevel);
        System.out.println("Level of Hungry: " + animalReferences.hungryLevel);
        System.out.println("Spirit level: " + animalReferences.spiritLevel);

        Adaptor adaptorReferences = new Adaptor();
        adaptorReferences.name = "Andrei";
        adaptorReferences.money = 100;
        System.out.println("Adaptors name: "+ adaptorReferences.name);
        System.out.println("Adaptors amount "+ adaptorReferences.money);

        FoodForAnimal foodReferences = new FoodForAnimal();
        foodReferences.name = "beef";
        foodReferences.levelOfHungry = 10;
        foodReferences.quantity = 1;
        System.out.println("Dog is eating: " + foodReferences.name);
        System.out.println("Dog's hungry level is at: " + foodReferences.levelOfHungry);


        Happy_time timeReferences = new Happy_time();
        timeReferences.name = "Playing with Adaptor";
        timeReferences.duration = 2;
        timeReferences.typeOfHappyTime = "preferred";
        System.out.println("Dog is " + timeReferences.name);


        Doctor doctorReferences = new Doctor();
        doctorReferences.name = "John";
        doctorReferences.levelOfHealth = 10;
        doctorReferences.price = 50;
        doctorReferences.typeOfMedicine = "pils";



    }


}
