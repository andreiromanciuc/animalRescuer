package org.fasttrackit;


import java.time.LocalDate;

public class Food {

    /* normal food or desert. The animal will want the normal food if it's
    hungry level will decrease lower than 5 points, in rest he will want deserts which will increase his
    spiritLevel but not so much hungryLevel */
    private String name;
    private String type;
    private int price;
    private double quantity; // how much food will be given to animal
    private int stock; //will decrease when it will be administrated to animal
    private int calories; // foodType var will increase different level of hungry

    private LocalDate expirationDate;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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
