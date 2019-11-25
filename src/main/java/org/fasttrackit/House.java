package org.fasttrackit;

public class House {
    private String name;
    private int comfort; // de la 1 .. 10
    private int sleepingTime; // measured in min 1-10. Due this increase healthLevel and decrease hungryLevel


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getComfort() {
        return comfort;
    }

    public void setComfort(int comfort) {
        this.comfort = comfort;
    }

    public int getSleepingTime() {
        return sleepingTime;
    }

    public void setSleepingTime(int sleepingTime) {
        this.sleepingTime = sleepingTime;
    }
}
