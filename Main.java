package ro.itschool.Tema.Rectangular;

public class Main {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(3,4);
       double area = myRectangle.getArea();
       double perimeter = myRectangle.getPerimeter();
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);




    }
}
