package org.fasttrackit;


import java.util.Timer;

public class Syringe extends Doctor {

    private static String nameSyringe = "syringe";

    public Syringe(String doctorName) {
        super(doctorName);
    }

    public static String getNameSyringe() {
        return nameSyringe;
    }

    public static void setNameSyringe(String nameSyringe) {
        Syringe.nameSyringe = nameSyringe;
    }
}
