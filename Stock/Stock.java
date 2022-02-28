package ro.itschool.Tema.Stock;

import jdk.jshell.spi.SPIResolutionException;

public class Stock {
    private String symbol;
    private String stockName;
    public double closingPrice;
    public double currentPrice;
    private double changePercent;

    public Stock (String givenSymbol, String givenName){
        this.symbol = givenSymbol;
        this.stockName = givenName;
    }
    public double getChangePercent(double closingPrice, double currentPrice){
        closingPrice = this.closingPrice;
        currentPrice =this.currentPrice;
        double percent =  (currentPrice - closingPrice)/ closingPrice;
        return this.changePercent = percent;
    }
    public void updatePrice (){
        this.closingPrice = this.currentPrice;


    }
}
