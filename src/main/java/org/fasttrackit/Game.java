package org.fasttrackit;

import java.util.*;

public class Game {
    Animal animal = new Animal();
    Food food = new Food();
    Rescuer rescuer = new Rescuer();
    Doctor doctor = new Doctor();


    private List<Food> availableFoods = new ArrayList<>();
    private Activity[] availableActivities = new Activity[3];


    public void start() throws Exception {
        System.out.println("Hello! Welcome to our game.");
        System.out.println("RULES OF THE GAME!");
        System.out.println("To win the game, you have to bring all values of your pet to 10 points.");
        System.out.println("If the values of our pet will drop down to 0, you will lose the game.");
        initRescuer();
        initAnimal();
        initFood();
        initActivities();
        finish();

    }

    private void initRescuer() throws Exception {
        Rescuer rescuer = new Rescuer();
        try {
            Scanner scannerName = new Scanner(System.in);
            Scanner scannerAge = new Scanner(System.in);
            System.out.println("Please introduce your name.");
            String name = scannerName.nextLine();
            rescuer.setName(name);
            System.out.println("Please introduce your age.");
            int age = scannerAge.nextInt();
            rescuer.setAge(age);
        } catch (InputMismatchException e) {
            System.out.println("Please introduce a valid number");
            initRescuer();
            System.out.println();
        }
        rescuer.setMoney(100);
        System.out.println(rescuer.getName() + ". " + rescuer.getAge() + " years old.");
        System.out.println("You starting the game with " + rescuer.getMoney() + "$");


    }

    private void initAnimal() {

        System.out.println("Which type of animal do you prefer?(Please enter the number)");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        Dog dog = new Dog();
        Cat cat = new Cat();
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();


        if (i == 1) {
            Scanner dogScanner = new Scanner(System.in);
            System.out.println("Which is the name for you pet?");
            animal.setName(dogScanner.nextLine());
            System.out.println("Your animal is a Dog, named: " + animal.getName());

        } else if (i == 2) {
            Scanner catScanner = new Scanner(System.in);
            System.out.println("Which is the name for you pet?");
            animal.setName(catScanner.nextLine());
            System.out.println("Your animal is a Cat, named: " + animal.getName());


        } else {
            System.out.println("Please insert the number from the range");
            initAnimal();
        }

    }

    private void initProcess() {
        System.out.println("Hungry level: "+animal.getHungryLevel());
        System.out.println("Spirit level: "+animal.getSpiritLevel());
        System.out.println("Health level: "+animal.getHealthLevel());
        animal.highSpirit();
        System.out.println("");
        System.out.println("How do you want to take care of "+animal.getName()+"?");
        System.out.println("1. I want to feed him.  (increase:  hungry level, spirit level)");
        System.out.println("2. I want to be with him.  (increase: spirit level; decrease: hungry level)");
        System.out.println("3. I want to bring him to a doctor. (increase: +5 health level; decrease: -2 spirit level)");


        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();

        if (scan == 1) {
            requireFeeding();
        } else if (scan == 2) {
            requireActivity();
        } else if (scan == 3) {
            initDoctor();
        } else {
            System.out.println("Please introduce the numbers from the range");
            initProcess();
        }
    }

    private void finish() {
        if (animal.getHungryLevel() >= 10 && animal.getHealthLevel() >= 10 && animal.getSpiritLevel() >= 10) {
            System.out.println("");
            System.out.println("Congratulations you saved "+animal.getName()+"!");
            animal.highSpirit();
        } else if (animal.getHungryLevel() <= 0) {
            System.out.println("");
            System.out.println("Hungry level dropped down to 0");
            System.out.println("We're sorry but "+animal.getName()+" died of hungry");
        } else if (animal.getSpiritLevel() <= 0) {
            System.out.println("");
            System.out.println("Spirit level dropped down to 0");
            System.out.println(animal.getName() + " ran away from you.");
        } else if (animal.getHealthLevel() <= 0) {
            System.out.println("");
            System.out.println("Health level dropped down to 0");
            System.out.println("We're sorry but " + animal.getName() + " died because of ill");
        } else {
            initProcess();
        }
    }

    private void requireFeeding() {
        System.out.println("Let's start to feed your pet");
        System.out.println("Please select the food");
        System.out.println("Available foods:");

        for (int i = 0; i < availableFoods.size(); i++) {
            System.out.println((i + 1) + ". " + availableFoods.get(i).getName());
        }

        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();

        if (animal.getHungryLevel() >= 10) {
            System.out.println(animal.getName() + " are not hungry, also spirit level has not increase.");
            animal.setHungryLevel(10);
            animal.setSpiritLevel(animal.getSpiritLevel() - 1);
            finish();
        } else if (scan == 1) {
            System.out.println("You selected meat.");
            animal.setHungryLevel(animal.getHungryLevel() + 4);

        } else if (scan == 2) {
            System.out.println("You selected pedigree");
            animal.setHungryLevel(animal.getHungryLevel() + 3);
            animal.setSpiritLevel(animal.getSpiritLevel()-1);

        } else if (scan == 3) {
            System.out.println("You selected cookie");

            animal.setSpiritLevel(animal.getSpiritLevel() + 2);
            animal.setHungryLevel(animal.getHungryLevel() + 1);
        } else {
            System.out.println("Please select the numbers from the range");
            requireFeeding();
        }
        finish();
    }

    private void requireActivity() {
        System.out.println("Let's start to make some activity with your pet");
        System.out.println("Please select the activity");
        System.out.println("Available activities: ");
        for (int i = 0; i < availableActivities.length; i++) {
            if (availableActivities[i] != null) {
                System.out.println((i + 1) + ". " + availableActivities[i].getName());
            }
        }

        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();

        if (animal.getSpiritLevel() >= 10) {

            animal.highSpirit();

            finish();
        } else if (scan == 1) {
            System.out.println("You going to " + availableActivities[0].getName() + " with " + animal.getName());
            animal.setSpiritLevel(animal.getSpiritLevel() + 2);
            animal.setHungryLevel(animal.getHungryLevel() - 1);
        } else if (scan == 2) {
            System.out.println("You going to " + availableActivities[1].getName() + " with " + animal.getName());
            animal.setSpiritLevel(animal.getSpiritLevel() + 4);
            animal.setHungryLevel(animal.getHungryLevel() - 2);
        } else {
            System.out.println("Please select the activity from the range");
            requireActivity();
        }

        finish();
    }

    private void initDoctor() {
        doctor.setName("Dr. Alex");
        System.out.println("Hello! My name is " + doctor.getName());
        if (animal.getHealthLevel() >= 10) {
            System.out.println("Your pet, " + animal.getName() + " is healthy.");
            finish();
        }
        System.out.println("Let's give some medicine to your pet");
        animal.setHealthLevel(animal.getHealthLevel() + 5);
        animal.setSpiritLevel(animal.getSpiritLevel() - 2);

        finish();
    }

    private void initFood() {
        Food food1 = new Food();
        food1.setName("Meat  (+4 hungry level)");
        food1.setType("normal");
        food1.setPrice(10);
        food1.setQuantity(2);
        food1.setStockFood(0);
        availableFoods.add(food1);

        Food food2 = new Food();
        food2.setName("Pedigree  (+3 hungry level; -1 spirit level)");
        food2.setType("normal");
        food2.setPrice(5);
        food2.setQuantity(5);
        food2.setStockFood(3);
        availableFoods.add(food2);

        Food cookieFood = new CookieFood();
        cookieFood.setName("cookie  (+1 hungry level; +2 spirit level)");
        cookieFood.setType("preferred");
        cookieFood.setPrice(7);
        cookieFood.setQuantity(5);
        cookieFood.setStockFood(2);
        availableFoods.add(cookieFood);

    }

    private void initActivities() {
        Activity activity1 = new Activity();
        activity1.setType("normal");
        activity1.setName("walk  (+2 spirit level; -1 hungry level)");
        activity1.setDuration(5);
        availableActivities[0] = activity1;

        Activity preferredActivity = new Activity();
        preferredActivity.setType("normal");
        preferredActivity.setName("play  (+4 spirit level; -2 hungry level)");
        preferredActivity.setDuration(10);
        availableActivities[1] = preferredActivity;

    }

}
