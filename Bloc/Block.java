package ro.itschool.Compozitie.Bloc;

import ro.itschool.Mostenire.ProgramGestiune.Product;

public class Block {
    private Floor floor;
    private String blockName;

    public Block(String blockName) {

    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public void displayBlock() {
        System.out.print("et-" + floor.getFloorNumber() + " :|| ");
        Apartment[] apartments = floor.getApartments();
        for (Apartment apartment : apartments) {

            System.out.print(apartment);
        }
    }
}
