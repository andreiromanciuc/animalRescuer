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
        animalReferences.dogAnimal.setAnimalNameDog("Rex");
        animalReferences.dogAnimal.setSpiritLevel(2);
        animalReferences.dogAnimal.setHungryLevel(4);
        animalReferences.dogAnimal.setHealthLevel(3);
        dogAnimal.setColor("Black");
        dogAnimal.setPreferredFood("Beef");

        
        System.out.println("Name " + dogAnimal.getAnimalNameDog());
        System.out.println("Age " + dogAnimal.getAge());
        System.out.println("Health " + dogAnimal.getHealthLevel());
        System.out.println("Hungry " + dogAnimal.getHungryLevel());

        Adaptor adaptorReferences = new Adaptor();
        GenderMale male = new GenderMale(29);

        adaptorReferences.male = male;

        adaptorReferences.male.setName("Andrei");
        adaptorReferences.male.setAge(29);
        adaptorReferences.setMoney(100);
        System.out.println("Adaptors name: "+ adaptorReferences.male.getName());
        System.out.println("The age of the adapter "+ adaptorReferences.male.getName());
        System.out.println("The money which adaptor have for the start "+ adaptorReferences.getMoney() + "$");

       FoodForAnimal foodReferences = new FoodForAnimal("desert");
       foodReferences.setFoodName("Cookie");

       HappyTime timeReferences = new HappyTime();
       timeReferences.setHappyTimeName("playing");






    }


}
