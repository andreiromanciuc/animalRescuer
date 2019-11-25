package org.fasttrackit;


import java.time.LocalDate;
import java.util.concurrent.ForkJoinPool;

public class App
{

    public static void main( String[] args )
    {
        System.out.println( "Hello, would you like to be my friend?" );

        Animal animalReferences = new Animal(3);
        Dog dogAnimal = new Dog(3);
        animalReferences.dogAnimal = dogAnimal;
        animalReferences.dogAnimal.spiritLevel = 5;
        animalReferences.dogAnimal.hungryLevel = 3;
        animalReferences.dogAnimal.healthLevel = 2;
        dogAnimal.color = "Black";
        dogAnimal.preferredFood = "Beef";

        System.out.println("Name " + dogAnimal.animalNameDog);
        System.out.println("Age " + dogAnimal.age);
        System.out.println("Health " + dogAnimal.healthLevel);
        System.out.println("Hungry " + dogAnimal.hungryLevel);

        Adaptor adaptorReferences = new Adaptor();
        GenderMale male = new GenderMale(29);

        adaptorReferences.male = male;

        adaptorReferences.male.name = "Andrei";
        adaptorReferences.male.age = 29;
        adaptorReferences.money = 100;
        System.out.println("Adaptors name: "+ adaptorReferences.male.name);
        System.out.println("The age of the adapter "+ adaptorReferences.male.age);
        System.out.println("The money which adaptor have for the start "+ adaptorReferences.money + "$");

       FoodForAnimal foodReferences = new FoodForAnimal();
       foodReferences.foodName = "Beef";

       HappyTime timeReferences = new HappyTime();
       timeReferences.happyTimeName = "playing";







    }


}
