package ro.itschool.Tema.ventilator;

public class Fan {

    private int slow = 1;
    private int medium = 2;
    private int fast = 3;
    private int speed = 1;
    private boolean turnedOn;
    private double radius;
    private String color;

    public Fan() {

        this.color =  "blue";
        this.radius = 5;
        this.turnedOn = false;
    }

    public int getSlow() {
        return slow;
    }
    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {

        if(turnedOn){
            return "Fan" + " speed: " + speed + ", is turnedOn: " + turnedOn + ", radius: " + radius + ", color: " + color;
            }
        else {
            return "Fan color is " + color + " and radius is " + radius;
        }
    }
}
