package ro.itschool.Compozitie.Bloc;

public class Main {

    public static void main(String[] args) {


        Block block = new Block("E1");
        Floor floor0 = new Floor(0);
        Apartment ap1 = new Apartment(1, "Popoescu");
        floor0.addApartments(ap1);
        Apartment ap2 = new Apartment(2, "Ionescu");
        floor0.addApartments(ap2);
        block.setFloor(floor0);
        block.displayBlock();
        System.out.println();

        Floor floor1 = new Floor(1);
        Apartment ap3 = new Apartment(3, "fam Georgescu");
        floor1.addApartments(ap3);
        Apartment ap4 = new Apartment(4, "fam Vladimirescu");
        floor1.addApartments(ap4);
        Apartment ap5 = new Apartment(5, "fam Tutulescu");
        floor1.addApartments(ap5);
        block.setFloor(floor1);
        block.displayBlock();

    }
}
