package org.fasttrackit;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class FoodForAnimal {

    /* normal food or desert. The animal will want the normal food if it's
    hungry level will decrease lower than 60 points, in rest he will want deserts which will increase his
    spiritLevel but not so much hungryLevel */

    private String foodType;
    private String foodName;
    private int foodPrice;
    private double foodQuantity; // how much food will be given to animal
    private int foodStock; //will decrease when it will be administrated to animal
    private int calories; // foodType var will increase different level of hungry

    private LocalDate expirationDate;

    CookieFood cookieFood;
    BasicFood basicFood;

    public FoodForAnimal(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public double getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(double foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public int getFoodStock() {
        return foodStock;
    }

    public void setFoodStock(int foodStock) {
        this.foodStock = foodStock;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
