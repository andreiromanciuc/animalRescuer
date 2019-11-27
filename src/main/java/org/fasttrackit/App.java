package org.fasttrackit;




public class App
{

    public static void main( String[] args )
    {
        Animal animal = new Animal("Rex", 3, "black");
        Adopter adaptor = new Adopter("Andrei", 29);
        System.out.println("Hello "+ adaptor.getName() + ". Welcome to our game!");


        System.out.println("Who is your pet?");

        System.out.println("This is a dog named "+animal.getName()+". He have "+ animal.getAge()
                +" years old and his color is "+animal.getColor()+".");
        animal.setHungryLevel(7);
        animal.setHealthLevel(4);
        animal.setSpiritLevel(2);

        Food food = new Food();
        HappyTime time = new HappyTime();
        time.setName("walked");
        CookieFood cookieFood = new CookieFood();
        cookieFood.setName("cookies");

        adaptor.feedAnimal(cookieFood, animal);
        adaptor.walk(time, animal);









    }


}
