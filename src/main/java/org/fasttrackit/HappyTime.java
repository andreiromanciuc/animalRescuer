package org.fasttrackit;

public class HappyTime {
    private String happyTimeType; // if it's preferred happy time, the spiritLevel will increase more
    private String happyTimeName; //playing with adaptor, walking, playing toy (different type of toys)
    private String toy;
    private int happyTimeDuration; // if user will select one of the happyTimeType, it will have different duration time

    public String getHappyTimeType() {
        return happyTimeType;
    }

    public void setHappyTimeType(String happyTimeType) {
        this.happyTimeType = happyTimeType;
    }

    public String getHappyTimeName() {
        return happyTimeName;
    }

    public void setHappyTimeName(String happyTimeName) {
        this.happyTimeName = happyTimeName;
    }

    public String getToy() {
        return toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }

    public int getHappyTimeDuration() {
        return happyTimeDuration;
    }

    public void setHappyTimeDuration(int happyTimeDuration) {
        this.happyTimeDuration = happyTimeDuration;
    }
}
