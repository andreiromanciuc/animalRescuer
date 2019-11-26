package org.fasttrackit;




public class App
{

    public static void main( String[] args )
    {
        Animal animal = new Animal("Rex", 3, "black");
        Adaptor adaptor = new Adaptor("Andrei", 29);
        System.out.println("Hello "+ adaptor.getName() + ". Welcome to our game!");


        System.out.println("Who is your pet?");

        System.out.println("This is a dog named "+animal.getNameAnimal()+". He have "+ animal.getAgeAnimal()
                +" years old and his color is "+animal.getColor()+".");
        animal.setHungryLevel(7);
        animal.setHealthLevel(4);
        animal.setSpiritLevel(2);

        Food food = new Food();
        HappyTime time = new HappyTime();

        adaptor.feed(food.cookieFood, animal.getNameAnimal(), 7);
        adaptor.walk(time.getHappyTimeName(), animal.getNameAnimal(), 2);












    }


}
