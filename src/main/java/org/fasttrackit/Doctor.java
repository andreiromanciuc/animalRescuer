package org.fasttrackit;

public class Doctor {
    private String name;
    private String specialization;
    private String medicine;
    /* will be two types, pill and syringe. If the pill will be administrated to animal, his healthLevel will increase
    with 2 points, if syringe with 4 points, but will decrease spiritLevel
     */

    int price; // price for pill will be lower than for syringe

    /* medicament administration will increase the health level of animal. The same var as at the
    animal level*/


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
