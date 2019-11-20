package org.fasttrackit;

public class Doctor {
    String doctorName;
    String specialization;
    String typeOfMedicine;
    /* will be two types, pill and syringe. If the pill will be administrated to animal, his healthLevel will increase
    with 2 points, if syringe with 4 points, but will decrease spiritLevel
     */

    int price; // price for pill will be lower than for syringe

    /* medicament administration will increase the health level of animal. The same var as at the
    animal level*/
    int healthLevel;

}
