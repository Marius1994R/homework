package ro.itschool.Tema.barbut;

public class JucatorBarbut {

    private int diceResult;
    private Zar dice1;
    private Zar dice2;

    public JucatorBarbut() {
        dice1 = new Zar();
        dice2 = new Zar();
    }

    public int rollDice () {
        int min = 1;
        int max = 6;
        int range = max - min + 1;

     return (int)(Math.random() * range - min);

    }

    public int getDiceResult() {
        int dice1Result = dice1.getDiceValue(rollDice());
        int dice2Result = dice2.getDiceValue(rollDice());
        return diceResult = dice1Result + dice2Result;
    }
}
