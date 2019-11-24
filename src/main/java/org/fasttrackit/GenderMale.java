package org.fasttrackit;

public class GenderMale extends Adaptor {
    String name;
    int age;

public void feed(FoodForAnimal foodAnimal, Dog feedAnimal){
    System.out.println(name +" just gave some "+ foodAnimal.foodName + " food to "+ feedAnimal.animalNameDog);
    int newHungryLevel;
    newHungryLevel = feedAnimal.hungryLevel + 4;
    System.out.println(feedAnimal.hungryLevel + " grew with"+newHungryLevel + " points.");
    foodAnimal.foodStock --;
    System.out.println(foodAnimal.foodStock + " decrease");
}
public void time(Dog timeAnimal, HappyTime timeHappy){
    System.out.println(name + " just " + timeHappy.happyTimeName + " with " + timeAnimal.animalNameDog);
    int newSpiritLevel;
    newSpiritLevel = timeAnimal.spiritLevel + 3;
    System.out.println(timeAnimal.spiritLevel + " grew with "+ newSpiritLevel + " points.");
}
}
