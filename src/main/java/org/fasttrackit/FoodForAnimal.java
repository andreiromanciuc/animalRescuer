package org.fasttrackit;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class FoodForAnimal {

    /* normal food or desert. The animal will want the normal food if it's
    hungry level will decrease lower than 60 points, in rest he will want deserts which will increase his
    spiritLevel but not so much hungryLevel */

    String foodType;
    String foodName;
    int foodPrice;
    double foodQuantity; // how much food will be given to animal
    int foodStock; //will decrease when it will be administrated to animal
    int levelOfHungry; // foodType var will increase different level of hungry
    int levelOfSpirit;
    LocalDate expirationDate;

    public FoodForAnimal(String foodType) {
        this.foodType = foodType;
    }
}
