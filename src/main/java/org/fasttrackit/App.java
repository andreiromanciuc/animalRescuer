package org.fasttrackit;


import java.time.LocalDate;

public class App
{

    public static void main( String[] args )
    {
        System.out.println( "Hello, would you like to be my friend?" );

        Animal animalReferences = new Animal();
        Dog dogAnimal = new Dog();
        animalReferences.dogAnimal = dogAnimal;

        dogAnimal.name = "Rex";
        animalReferences.dogAnimal.age = 3;
        animalReferences.dogAnimal.spiritLevel = 5;
        animalReferences.dogAnimal.hungryLevel = 4;
        animalReferences.dogAnimal.healthLevel = 2;
        dogAnimal.color = "Black";
        dogAnimal.preferredFood = "Beef";

        System.out.println("Name " + dogAnimal.name);
        System.out.println("Age " + dogAnimal.age);
        System.out.println("Health " + dogAnimal.healthLevel);
        System.out.println("Hungry " + dogAnimal.hungryLevel);



        Adaptor adaptorReferences = new Adaptor();
        GenderMale male = new GenderMale();
        adaptorReferences.male = male;

        adaptorReferences.male.name = "Andrei";
        adaptorReferences.male.age = 29;
        adaptorReferences.money = 100;
        System.out.println("Adaptors name: "+ adaptorReferences.male.name);
        System.out.println("The age of the adapter "+ adaptorReferences.male.age);
        System.out.println("The money which adaptor have for the start "+ adaptorReferences.money + "$");

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
