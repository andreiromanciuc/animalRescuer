package org.fasttrackit;

public class BasicFood extends FoodForAnimal{
    private static String normalFood = "basic food";

    public BasicFood(String foodName) {
        super(foodName);
    }

    public static String getNormalFood() {
        return normalFood;
    }

    public static void setNormalFood(String normalFood) {
        BasicFood.normalFood = normalFood;
    }
}
