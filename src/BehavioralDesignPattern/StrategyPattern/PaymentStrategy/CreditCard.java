package BehavioralDesignPattern.StrategyPattern.PaymentStrategy;

public class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("You have pay Rs. "+amount+" from CreditCard");
    }
}
