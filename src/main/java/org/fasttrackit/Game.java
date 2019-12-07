package org.fasttrackit;


import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Food> availableFood = new ArrayList<Food>();
    private Activity[] availableActivities = new Activity[3];

    public void start(){
        initFood();
        initActivities();
        displayFood();
        displayActivities();
    }
    private void initFood() {
        Food food1 = new Food();
        food1.setName("Meat");
        food1.setType("normal");
        food1.setPrice(10);
        food1.setQuantity(2);
        food1.setStockFood(0);
        availableFood.add(food1);

        Food food2 = new Food();
        food2.setName("Pedigree");
        food2.setType("normal");
        food2.setPrice(5);
        food2.setQuantity(5);
        food2.setStockFood(3);
        availableFood.add(food2);

        Food cookieFood = new CookieFood();
        cookieFood.setName("cookie");
        cookieFood.setType("preferred");
        cookieFood.setPrice(7);
        cookieFood.setQuantity(5);
        cookieFood.setStockFood(2);
        availableFood.add(cookieFood);

    }
    private void initActivities(){
        Activity activity1 = new Activity();
        activity1.setType("normal");
        activity1.setName("walk");
        activity1.setDuration(5);
        availableActivities[0] = activity1;

        Activity preferredActivity = new Activity();
        preferredActivity.setType("normal");
        preferredActivity.setName("play");
        preferredActivity.setDuration(10);
        availableActivities[1] = preferredActivity;

    }

    public void displayFood(){
        System.out.println("Available foods: ");

        for (int i = 0; i < availableFood.size(); i++){
            System.out.println((i+1)+". "+ availableFood.get(i).getName());
        }

    }
    public void displayActivities(){
        System.out.println("Available activities: ");

        for (int i =0; i < availableActivities.length; i++){
            if (availableActivities[i] != null) {
                System.out.println((i+1)+". "+ availableActivities[i].getName());
            }
        }
    }

}
