package org.fasttrackit;

public class Doctor {
   private String name;
    private String specialization;
    private String typeOfMedicine;
    /* will be two types, pill and syringe. If the pill will be administrated to animal, his healthLevel will increase
    with 2 points, if syringe with 4 points, but will decrease spiritLevel
     */

    int price; // price for pill will be lower than for syringe

    /* medicament administration will increase the health level of animal. The same var as at the
    animal level*/
    int healthLevel;


    public Doctor(String doctorName) {
        this.name = doctorName;
    }

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

    public String getTypeOfMedicine() {
        return typeOfMedicine;
    }

    public void setTypeOfMedicine(String typeOfMedicine) {
        this.typeOfMedicine = typeOfMedicine;
    }
}
