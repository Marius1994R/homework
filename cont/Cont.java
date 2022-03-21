package ro.itschool.Tema.cont;

import java.util.Date;

public class Cont {
    private int contId = 0;
    private double soldCont = 0;
    private double annualInterestRate = 0;
    private Date dateCrated;

    public Cont(){

    }

    public Cont(int id, double sold){
        this.contId = id;
        this.soldCont = sold;
    }

    public void setContId(int id){
        this.contId = id;
    }

    public int getContId(){
        return this.contId;
    }

    public void setSoldCont(int sold){
        this.soldCont = sold;
    }

    public double getSoldCont(){
        return this.soldCont;
    }

    public void setAnnualInterestRate(double nominalRate){
        this.annualInterestRate = Math.pow((1 + (nominalRate/12)), (nominalRate - 1));
    }

    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }

    public Date getDateCrated(){
        return this.dateCrated = new Date();

    }

    public double getMonthlyInterestRate(){
        return this.annualInterestRate / 12;
    }

    public double withdraw(double amountWithdrawn){
        double withdraw = this.soldCont - amountWithdrawn;
        this.soldCont = withdraw;
        return withdraw;
    }

    public double deposit(double amountDeposited){
        double deposit = this.soldCont + amountDeposited;
        this.soldCont = deposit;
        return deposit;
    }
}
