package org.fasttrackit;


import java.time.LocalDate;
import java.util.Date;

public class App
{

    public static void main( String[] args )
    {
        System.out.println( "Hello, would you like to be my friend?" );

        Animal animalReferences = new Animal();

        animalReferences.age = 3;
        animalReferences.healthLevel = 4;
        animalReferences.hungryLevel = 2;
        animalReferences.preferredFood = "beef";
        animalReferences.preferredHappyTime = "To play with Adaptor";
        animalReferences.spiritLevel = 1;

        System.out.println("Age: " + animalReferences.age);
        System.out.println("Level of Health: " + animalReferences.healthLevel);
        System.out.println("Level of Hungry: " + animalReferences.hungryLevel);
        System.out.println("Spirit level: " + animalReferences.spiritLevel);

        Adaptor adaptorReferences = new Adaptor();
        adaptorReferences.adaptorName = "Andrei";
        adaptorReferences.money = 100;
        System.out.println("Adaptors name: "+ adaptorReferences.adaptorName);
        System.out.println("Adaptors amount "+ adaptorReferences.money);

        FoodForAnimal foodReferences = new FoodForAnimal();
        foodReferences.foodName = "beef";
        foodReferences.hungryLevel = 10;
        foodReferences.foodQuantity = 1;
        LocalDate.now().plusDays(2);
        System.out.println("Dog is eating: " + foodReferences.foodName);
        System.out.println("Dog's hungry level is at: " + foodReferences.hungryLevel);



        HappyTime timeReferences = new HappyTime();
        timeReferences.happyTimeName = "Playing with Adaptor";
        timeReferences.happyTimeDuration = 2;
        timeReferences.happyTimeType = "preferred";
        System.out.println("Dog is " + timeReferences.happyTimeName);


        Doctor doctorReferences = new Doctor();
        doctorReferences.doctorName = "John";
        doctorReferences.healthLevel = 10;
        doctorReferences.price = 50;
        doctorReferences.typeOfMedicine = "pils";



    }


}
