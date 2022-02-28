package ro.itschool.Tema.Stock;

public class Main {
    public static void main(String[] args) {

       Stock stock = new Stock("LC@", "LeoCoin@");
       stock.closingPrice = 1.5;
       stock.currentPrice = 3.45;
       double percent = stock.getChangePercent(stock.closingPrice, stock.currentPrice);
        System.out.println("The closing price was: " + stock.closingPrice);
        System.out.println("The actual price is: " + stock.currentPrice);
        System.out.println("The percent is: " + percent);
        stock.updatePrice();


    }
}
