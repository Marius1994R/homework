package ro.itschool.Tema.Tv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ON or OFF");
        String userChoice = input.nextLine();
        System.out.println();
        Tv myTv = new Tv(userChoice);
        if(userChoice.equals("ON") || userChoice.equals("on")){
            System.out.println("Chose the channel");
        }
        System.out.println();
        int number = input.nextInt();
        myTv.setChannelNumber(number);
        myTv.getChannelNumber();
        myTv.nextChannel();
        myTv.previousChannel();
        System.out.println();

        for(int i = 0; i <= 51; i++){
            myTv.volumeUp();
        }
        for(int i = 0; i <= 51; i++){
            myTv.volumeDown();
        }

    }
}
