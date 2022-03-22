package ro.itschool.Tema.barbut;

import java.util.Scanner;

public class BarbutGame {

    Scanner input = new Scanner(System.in);
    private JucatorBarbut player1;
    private JucatorBarbut player2;
    private int diceResult1;
    private int diceResult2;


    public BarbutGame() {
        this.player1 = new JucatorBarbut();
        this.player2 = new JucatorBarbut();
    }

    public void startGame (){
        System.out.println("Player1 ready?");
        String optionPlayer1 = input.next();
        player1.rollDice();
        this.diceResult1 = player1.getDiceResult();
        System.out.println("Player1 rolled " + diceResult1);



        System.out.println("Player2 ready?");
        String optionPlayer2 = input.next();
        player2.rollDice();
        this.diceResult2 = player2.getDiceResult();
        System.out.println("Player2 rolled " + diceResult2);

        checkWinner(this.player1, this.player2);

    }

    private void checkWinner (JucatorBarbut player1, JucatorBarbut player2){

        if(diceResult1 == diceResult2){
            System.out.println("Is a draw!!!");
        } else if(diceResult1 > diceResult2) {
            System.out.println("Player1 wins");
        } else if(diceResult2 > diceResult1){
            System.out.println("Player2 wins");
        }
    }
}

