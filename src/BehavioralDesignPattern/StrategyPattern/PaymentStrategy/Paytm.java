package BehavioralDesignPattern.StrategyPattern.PaymentStrategy;

public class Paytm implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("You have pay Rs. "+amount+" from Paytm");
    }
}
