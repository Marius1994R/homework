package ro.itschool.Tema.Rectangular;

public class Rectangle {
    private double rectangleWidth = 1;
    private double rectangleLength = 1;

    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.rectangleWidth = width;
        this.rectangleLength = length;
    }

    public double getArea (){
        return this.rectangleLength * this.rectangleWidth;
    }

    public double getPerimeter(){
        return 2 * (this.rectangleWidth + this.rectangleLength);
    }

}
