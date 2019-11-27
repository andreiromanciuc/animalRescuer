package org.fasttrackit;

public class HappyTime {
    private String type; // if it's preferred happy time, the spiritLevel will increase more
    private String name; //playing with adaptor, walking, playing toy (different type of toys)
    private int duration; // if user will select one of the happyTimeType, it will have different
    // duration time

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
