package ro.itschool.Tema.cont;


public class Main {
    public static void main(String[] args) {

        Cont myCont = new Cont();

        double nominalRate = 5.0;
            myCont.setContId(1596);
            myCont.setSoldCont(5000);
            myCont.setAnnualInterestRate(nominalRate);
            myCont.getDateCrated();
            myCont.getAnnualInterestRate();
            myCont.getMonthlyInterestRate();
        System.out.println(myCont.getContId());
        System.out.println(myCont.getSoldCont());
        System.out.println(myCont.getDateCrated());
        System.out.printf("%.3f", myCont.getAnnualInterestRate());
        System.out.printf("\n%.3f",myCont.getMonthlyInterestRate());
        myCont.deposit(1000);
        myCont.withdraw(550);
        System.out.println();
        System.out.println(myCont.getSoldCont());




    }
}
