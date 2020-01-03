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
            dog.setName(dogScanner.nextLine());
            System.out.println("Your animal is a Dog, named: " + dog.getName());

        } else if (i == 2) {
            Scanner catScanner = new Scanner(System.in);
            System.out.println("Which is the name for you pet?");
            cat.setName(catScanner.nextLine());
            System.out.println("Your animal is a Cat, named: " + cat.getName());


        } else {
            System.out.println("Please insert the number from the range");
            initAnimal();
        }

    }

    private void initProcess(){
        System.out.println("How do you want to take care of your pet?");
        System.out.println("1. I want to feed him");
        System.out.println("2. I want to be with him");
        System.out.println("3. I want to bring him to a doctor");


        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();

        if (scan == 1){
            requireFeeding();
        }else if (scan == 2){
            requireActivity();
        }else if (scan ==3){
            initDoctor();
        }else {
            System.out.println("Please introduce the numbers from the range");
            initProcess();
        }
    }

    private void finish() {
        if (animal.getHungryLevel() >= 10 && animal.getHealthLevel() >= 10 && animal.getSpiritLevel() >=10){
            System.out.println("Congratulations you saved your animal!!!");
        }else {
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
        if (scan == 1){
            System.out.println("You selected meat.");
            animal.setHungryLevel(animal.getHungryLevel()+3);
        } else if (scan == 2 ){
            System.out.println("You selected pedigree");
            animal.setHungryLevel(animal.getHungryLevel()+2);
        }else if (scan == 3){
            System.out.println("You selected cookie");
            rescuer.feedAnimal(food, animal);
        }else {
            System.out.println("Please select the numbers from the range");
            requireFeeding();
        }
        System.out.println("");
        System.out.println("After feeding, "+animal.getName()+" have values: ");
        System.out.println("Hungry level: " + animal.getHungryLevel());
        System.out.println("Health level: " + animal.getHealthLevel());
        System.out.println("Spirit level: " + animal.getSpiritLevel());
        System.out.println("");
        animal.highSpirit();
        initProcess();
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

        if (scan == 1) {
            System.out.println("You going to " + availableActivities[0].getName() + " with " + animal.getName());
            animal.setSpiritLevel(animal.getSpiritLevel() + 2);
            animal.setHungryLevel(animal.getHungryLevel()-1);
        } else if (scan == 2) {
            System.out.println("You going to " + availableActivities[1].getName() + " with " + animal.getName());
            animal.setSpiritLevel(animal.getSpiritLevel()+4);
            animal.setHungryLevel(animal.getHungryLevel()-2);
        } else {
            System.out.println("Please select the activity from the range");
            requireActivity();
        }
        System.out.println("");
        System.out.println("After activity "+animal.getName()+" have values: ");
        System.out.println("Hungry level: " + animal.getHungryLevel());
        System.out.println("Health level: " + animal.getHealthLevel());
        System.out.println("Spirit level: " + animal.getSpiritLevel());
        System.out.println("");
        animal.highSpirit();
        initProcess();
    }

    private void initDoctor(){
        doctor.setName("Dr. Alex");
        System.out.println("Hello! My name is "+ doctor.getName() );
        System.out.println("Let's give some medicine to your pet");
        animal.setHealthLevel(animal.getHealthLevel()+5);
        animal.setSpiritLevel(animal.getSpiritLevel()-2);
        System.out.println("Health level of your pet is " + animal.getHealthLevel());
        System.out.println("Spirit level of your pet is " + animal.getSpiritLevel());
        initProcess();
    }

    private void initFood() {
        Food food1 = new Food();
        food1.setName("Meat");
        food1.setType("normal");
        food1.setPrice(10);
        food1.setQuantity(2);
        food1.setStockFood(0);
        availableFoods.add(food1);

        Food food2 = new Food();
        food2.setName("Pedigree");
        food2.setType("normal");
        food2.setPrice(5);
        food2.setQuantity(5);
        food2.setStockFood(3);
        availableFoods.add(food2);

        Food cookieFood = new CookieFood();
        cookieFood.setName("cookie");
        cookieFood.setType("preferred");
        cookieFood.setPrice(7);
        cookieFood.setQuantity(5);
        cookieFood.setStockFood(2);
        availableFoods.add(cookieFood);

    }

    private void initActivities() {
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




}
