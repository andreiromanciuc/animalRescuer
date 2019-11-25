package org.fasttrackit;

public class BasicFood extends Food {
    private static String normalFood = "basic food";



    public static String getNormalFood() {
        return normalFood;
    }

    public static void setNormalFood(String normalFood) {
        BasicFood.normalFood = normalFood;
    }
}
