package ro.itschool.Compozitie.Bloc;

import ro.itschool.Compozitie.Student;

import java.util.Arrays;

public class Floor {
    private int floorNumber;
    private int length = 0;
    private Apartment[] apartments = new Apartment[5];


    public Floor(int floorNumber) {
    this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return this.floorNumber;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

    public void addApartments (Apartment apartment){
        this.apartments[length] = apartment;
        length++;
    }

}

