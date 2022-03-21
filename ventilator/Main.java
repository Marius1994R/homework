package ro.itschool.Tema.ventilator;

public class Main {

    public static void main(String[] args) {
        Fan myFan = new Fan();

        myFan.setTurnedOn(true);
        int fanSpeed =  myFan.getSpeed();
        myFan.setRadius(10);
        myFan.setColor("green");
        myFan.setSpeed(3);
        System.out.println(myFan.toString());

        Fan myFan2 = new Fan();
        myFan2.setTurnedOn(false);
        System.out.println(myFan2.toString());

    }
}
