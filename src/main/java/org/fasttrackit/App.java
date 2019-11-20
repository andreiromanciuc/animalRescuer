package org.fasttrackit;


import com.sun.org.apache.xerces.internal.impl.dv.xs.DayDV;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.MonthDay;
import java.util.Date;

public class App
{
//    ADAUGA TIMPUL, CAT DUREAZA O LUNA DIN VIATA ANIMALULUI!!!!!
//    INTREABA DE VARIABILA TIMPULUI SI CUM SE FOLOSESTE!!!!
//    INTREABA DE VARIABILA LITERALS

    public static void main( String[] args )
    {
        System.out.println( "Hello, would you like to be my friend?" );

        Animal animalReferences = new Animal();
        animalReferences.typeOfAnimal = "Dog";
        animalReferences.name = "Rex";
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
        adaptorReferences.adaptorName = "Andrei";
        adaptorReferences.money = 100;
        System.out.println("Adaptors name: "+ adaptorReferences.adaptorName);
        System.out.println("Adaptors amount "+ adaptorReferences.money);

        FoodForAnimal foodReferences = new FoodForAnimal();
        foodReferences.foodName = "beef";
        foodReferences.hungryLevel = 10;
        foodReferences.foodQuantity = 1;
        foodReferences.expirationDate = new Date(2019,11,22);
        System.out.println("Dog is eating: " + foodReferences.foodName);
        System.out.println("Dog's hungry level is at: " + foodReferences.hungryLevel);



        Happy_time timeReferences = new Happy_time();
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
