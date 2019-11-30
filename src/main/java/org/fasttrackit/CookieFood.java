package org.fasttrackit;

public class CookieFood extends Food {
    private static String cookie = "cookie";



    public static String getCookie() {
        return cookie;
    }

    public static void setCookie(String cookie) {
        CookieFood.cookie = cookie;
    }
}
