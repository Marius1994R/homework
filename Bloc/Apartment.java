package ro.itschool.Compozitie.Bloc;

public class Apartment {

    private int apartmentNumber;
    private String familyName;

    public Apartment(int apartmentNumber, String familyName){
        this.apartmentNumber = apartmentNumber;
        this.familyName = familyName;

    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public String getFamilyName() {
        return familyName;
    }

    @Override
    public String toString() {
        return  apartmentNumber + " fam. " + familyName + " || ";
    }
}