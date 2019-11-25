package org.fasttrackit;

public class CookieFood extends FoodForAnimal {
    private static String cookie = "cookie";


    public CookieFood(String foodName) {
        super(foodName);
    }

    public static String getCookie() {
        return cookie;
    }

    public static void setCookie(String cookie) {
        CookieFood.cookie = cookie;
    }
}
