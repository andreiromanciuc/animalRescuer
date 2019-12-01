package org.fasttrackit;




public class App
{

    public static void main( String[] args )
    {
        Animal animal = new Animal("Rex");
        Rescuer adaptor = new Rescuer("Andrei", 29);

        System.out.println("Hello "+ adaptor.getName() + ". Welcome to our game!");


        System.out.println("Who is your pet?");

        System.out.println("This is a dog named "+animal.getName()+". He have "+ animal.getAge()
                +" years old and his color is "+animal.getColor()+".");
        animal.setHungryLevel(7);
        animal.setHealthLevel(4);
        animal.setSpiritLevel(9);



        Food food = new Food();
        food.setName("cookie");
        food.setStockCookie(5);




        HappyTime time = new HappyTime();
        time.setName("play");

        Dog dog = new Dog();
        adaptor.feedAnimal(food, animal);
        adaptor.walk(time, animal);
        animal.highSpirit();
        dog.highSpirit();





    }


}
