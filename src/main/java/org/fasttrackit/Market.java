package org.fasttrackit;

public class Market {
    private String food;
    private String toy; // the same as at happyTime var
    private String house;
    private String devices; // different types of plates which will increase spiritLevel
    // and foodQuantity for administration. It will have different prices

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getToy() {
        return toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getDevices() {
        return devices;
    }

    public void setDevices(String devices) {
        this.devices = devices;
    }
}
