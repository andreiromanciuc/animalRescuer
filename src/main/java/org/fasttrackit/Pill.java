package org.fasttrackit;

public class Pill extends Doctor {
    private static String namePill = "pill";

    public Pill(String doctorName) {
        super(doctorName);
    }

    public static String getNamePill() {
        return namePill;
    }

    public static void setNamePill(String namePill) {
        Pill.namePill = namePill;
    }
}
